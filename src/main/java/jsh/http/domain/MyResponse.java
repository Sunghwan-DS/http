package jsh.http.domain;

import lombok.Builder;

@Builder
public record MyResponse(
    String responseMsg
) {
    public static MyResponse of(String msg) {
        return MyResponse.builder()
                         .responseMsg(msg)
                         .build();
    }
}
