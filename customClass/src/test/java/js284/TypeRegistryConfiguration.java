package js284;

import java.util.Locale;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;

import static java.util.Locale.ENGLISH;

/**
 * TypeRegistryConfiguration
 */
public class TypeRegistryConfiguration implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineParameterType(new ParameterType<>(
        "ticketArg",           // name
        "ticket|Ticket", // regexp
        Ticket.class,       // type
        Ticket::new         // transformer function
        ));

    }

    
}