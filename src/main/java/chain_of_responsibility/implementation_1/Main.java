package chain_of_responsibility.implementation_1;

import chain_of_responsibility.implementation_1.domain.HTTPMethod;
import chain_of_responsibility.implementation_1.domain.HTTPRequest;
import chain_of_responsibility.implementation_1.processors.*;
import chain_of_responsibility.implementation_1.processors.mainProsessor.HTTPAuthenticationRequestProcessor;

public class Main {

    public static void main(String[] args) {
        HTTPRequest request = new HTTPRequest("\\authentication",
                                                HTTPMethod.POST,
                                                "\"Content-type\": \"application/json;chartSet=UTF-UTF-8\"",
                                                "{\"username\": \"User\", \"password\": \"123456\"}");

        HTTPAuthenticationRequestProcessor rootProcessor = new HTTPAuthenticationRequestProcessor(request);
        rootProcessor.add(new PathProcessorAuthentication(request));
        rootProcessor.add(new HTTPAuthenticationMethodProcessor(request));
        rootProcessor.add(new HTTPAuthenticationHeaderProcessor(request));
        rootProcessor.add(new HTTPBodyProcessor(request));
        rootProcessor.check();
    }
}
