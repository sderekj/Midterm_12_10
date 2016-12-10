package nyc.c4q.dereksantos.midterm_12_10;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VineFragment extends Fragment {

    private static final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRoot = inflater.inflate(R.layout.vine_list, container, false);
//        mRecyclerView = (RecyclerView) mRoot.findViewById(R.id.vine_recyclerview);
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        fetchVinelist();
        return mRoot;
    }

    private void fetchVinelist() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.vine.co/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        VineApi api = retrofit.create(VineApi.class);

        Call<VineResponse> call = api.getRecords();

        call.enqueue(new Callback<VineResponse>() {
            @Override
            public void onResponse(Call<VineResponse> call, Response<VineResponse> response) {
//                Log.d(TAG, "################### This is a successful onResponse: " + new Gson().toJson(response));
//                Log.d(TAG, "################### This is a successful onResponse: " + new Gson().toJson(response.body()));
                Log.d(TAG, "################### This is a successful onResponse: " + response.body().getData().getCount());
            }

            @Override
            public void onFailure(Call<VineResponse> call, Throwable t) {

            }
        });
    }
}
