package es.upsa.ssi.trabajo1.wscontratos.adapters.input.health;


import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@ApplicationScoped
@Readiness
public class TestHealthCheck implements HealthCheck
{
    @Override
    public HealthCheckResponse call()
    {
        return HealthCheckResponse.builder()
                .name("Test Contratos")
                .up()
                .withData("datetime", LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME))
                .build();
    }
}
