package devf.co.devfmarvelapplication.rest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import devf.co.devfmarvelapplication.model.Hero;
import devf.co.devfmarvelapplication.rest.Constants;

/**
 * This class contains the structure of the response for the
 * {@link devf.co.devfmarvelapplication.rest.MarvelApiService#requestHeroesList(int, int, String, long, String, retrofit.Callback)}
 * */
public class HeroesListResponse {
    @SerializedName(Constants.CODE_KEY)
    int code;

    @SerializedName(Constants.STATUS_KEY)
    String status;

    //We expose these fields because we gonna parse them manually with a deserializer
    @Expose
    int offset;

    @Expose
    ArrayList<Hero> heroes;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }
}

