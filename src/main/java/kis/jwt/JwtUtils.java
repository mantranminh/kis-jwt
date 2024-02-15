package kis.jwt;

import com.google.gson.Gson;
import kis.jwt.exceptions.InvalidJwtException;
import kis.jwt.models.JwtPayload;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class JwtUtils {
    private static final Gson GSON = new Gson();

    public static JwtPayload decodeJwt(String validatedJwtToken) {
        JwtPayload p = GSON.fromJson(new String(Base64.getDecoder()
                .decode(validatedJwtToken.split("\\.")[1]), StandardCharsets.UTF_8), JwtPayload.class);
        if (p.getUd() == null || p.getUd().getUsername() == null) {
            throw new InvalidJwtException("Missing ud or username in JWT");
        }
        return p;
    }
}
