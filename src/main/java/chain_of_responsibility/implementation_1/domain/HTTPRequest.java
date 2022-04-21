package chain_of_responsibility.implementation_1.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HTTPRequest {
    private String path;
    private HTTPMethod method;
    private String header;
    private String body;

    @Override
    public String toString() {
        return "HTTPRequest{" +
                "path='" + path + '\'' +
                ", method=" + method +
                ", header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
