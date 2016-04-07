package com.fangxu.dota2helper.network;

import com.fangxu.dota2helper.bean.NewsList;

import java.util.List;

import retrofit.http.GET;
import rx.Observable;

/**
 * Created by Xuf on 2016/4/6.
 */
public interface NewsApi {
    @GET("/api/v1.0/news/update")
    Observable<NewsList> updateNews();
}