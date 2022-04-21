package chain_of_responsibility.implementation_1.processors;

import chain_of_responsibility.implementation_1.domain.HTTPMethod;
import chain_of_responsibility.implementation_1.domain.HTTPRequest;
import chain_of_responsibility.implementation_1.exceptions.AuthorizationException;
import chain_of_responsibility.implementation_1.processors.mainProsessor.HTTPAuthenticationRequestProcessor;

public class HTTPAuthenticationMethodProcessor extends HTTPAuthenticationRequestProcessor {

    public HTTPAuthenticationMethodProcessor(HTTPRequest request) {
        super(request);
    }

    @Override
    public void check() {
        if(request.getMethod().equals(HTTPMethod.POST)) {
            super.check();
        } else {
            throw new AuthorizationException("Incorrect HTTPMethod");
        }
    }

    @Override
    public String toString() {
        return "HTTPAuthenticationMethodProcessor";
    }

}
