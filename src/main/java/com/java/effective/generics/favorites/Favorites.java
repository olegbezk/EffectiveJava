package com.java.effective.generics.favorites;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oleg on 22 Aug 2015.
 *
 */
public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<Class<?>, Object>();

    public <T> void putFavorite(Class<T> type, T instance) {

        if (type == null) {
            throw new NullPointerException("Type is Null");
        }
        favorites.put(type, instance);
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }
}
