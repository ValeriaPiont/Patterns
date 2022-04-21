package chain_of_responsibility.implementation_1.processors;

import chain_of_responsibility.implementation_1.domain.HTTPRequest;
import chain_of_responsibility.implementation_1.exceptions.AuthorizationException;
import chain_of_responsibility.implementation_1.processors.mainProsessor.HTTPAuthenticationRequestProcessor;

public class PathProcessorAuthentication extends HTTPAuthenticationRequestProcessor {

    public PathProcessorAuthentication(HTTPRequest request) {
        super(request);
    }

    @Override
    public void check() {
        if(request.getPath().equals("\\authentication")) {
            super.check();
        } else {
            throw new AuthorizationException("Incorrect authentication path");
        }
    }

    @Override
    public String toString() {
        return "PathProcessorAuthentication";
    }
}
