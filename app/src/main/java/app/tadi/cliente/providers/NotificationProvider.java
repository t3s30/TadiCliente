package app.tadi.cliente.providers;

import app.tadi.cliente.models.FCMBody;
import app.tadi.cliente.models.FCMResponse;
import app.tadi.cliente.retrofit.IFCMApi;
import app.tadi.cliente.retrofit.RetrofitClient;

import retrofit2.Call;

public class NotificationProvider {

    private String url = "https://fcm.googleapis.com";

    public NotificationProvider() {
    }

    public Call<FCMResponse> sendNotification(FCMBody body) {
        return RetrofitClient.getClientObject(url).create(IFCMApi.class).send(body);
    }
}
