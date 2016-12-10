package nyc.c4q.dereksantos.midterm_12_10;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SACC on 12/10/16.
 */
public interface VineApi {

    @GET("api/timelines/users/918753190470619136")
    Call<VineResponse> getRecords();
}
