package chain_of_responsibility.implementation_1.processors;

import chain_of_responsibility.implementation_1.domain.User;
import chain_of_responsibility.implementation_1.domain.HTTPRequest;
import chain_of_responsibility.implementation_1.exceptions.AuthorizationException;
import chain_of_responsibility.implementation_1.processors.mainProsessor.HTTPAuthenticationRequestProcessor;
import chain_of_responsibility.implementation_1.utils.JSONUtils;

public class HTTPBodyProcessor extends HTTPAuthenticationRequestProcessor {

    public HTTPBodyProcessor(HTTPRequest request) {
        super(request);
    }

    @Override
    public void check() {
        if(request.getBody() != null || !request.getBody().isEmpty()) {
            JSONUtils utils = new JSONUtils();
            User authObject = utils.fromJSON(request.getBody());
            System.out.println(utils.toJSON(authObject));
            super.check();
        } else {
            throw new AuthorizationException("Wrong username or password");
        }
    }

    @Override
    public String toString() {
        return "HTTPBodyProcessor";
    }

}
