package chain_of_responsibility.implementation_1.processors.mainProsessor;

import chain_of_responsibility.implementation_1.domain.HTTPRequest;

public class HTTPAuthenticationRequestProcessor {
    protected HTTPRequest request;
    protected HTTPAuthenticationRequestProcessor nextProcessor;

    public HTTPAuthenticationRequestProcessor(HTTPRequest request) {
        this.request = request;
    }

    public void add(HTTPAuthenticationRequestProcessor processor) {
        if (nextProcessor != null) {
            nextProcessor.add(processor);
//            System.out.println("In the class " + this);
        } else {
            nextProcessor = processor;
        }
    }

    public void check(){
        if (nextProcessor != null) {
            System.out.println("Next processor -> " + nextProcessor);
            nextProcessor.check();
        } else {
            System.out.println("ACCESS ALLOWED");
        }
    }

    @Override
    public String toString() {
        return "HTTPAuthenticationRequestProcessor";
    }
}
