package app.tadi.cliente.retrofit;

import app.tadi.cliente.models.FCMBody;
import app.tadi.cliente.models.FCMResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMApi {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAABS1ubHk:APA91bECjYt23bMmzYznpN7tdjAXzbxONMwJ-SV9V6rC_HFIgu3QckGGKTRyp2gZeze_dzx7-e2aqmGNxxKRJ-ko5jFfY2gllD0B3HRugJjNblab2wQhObXWTqMAl6FDb5HYH-2VBgBP"
    })
    @POST("fcm/send")
    Call<FCMResponse> send(@Body FCMBody body);

}
