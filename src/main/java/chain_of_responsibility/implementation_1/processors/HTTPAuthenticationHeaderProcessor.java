package chain_of_responsibility.implementation_1.processors;

import chain_of_responsibility.implementation_1.domain.HTTPRequest;
import chain_of_responsibility.implementation_1.exceptions.AuthorizationException;
import chain_of_responsibility.implementation_1.processors.mainProsessor.HTTPAuthenticationRequestProcessor;

public class HTTPAuthenticationHeaderProcessor extends HTTPAuthenticationRequestProcessor {

    public HTTPAuthenticationHeaderProcessor(HTTPRequest request) {
        super(request);
    }

    @Override
    public void check() {
        if(request.getHeader().equals("\"Content-type\": \"application/json;chartSet=UTF-UTF-8\"")) {
            super.check();
        } else {
            throw new AuthorizationException("Incorrect HTTPHeader");
        }
    }

    @Override
    public String toString() {
        return "HTTPAuthenticationHeaderProcessor";
    }

}
