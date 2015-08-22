package com.java.effective.favorites;

/**
 * Created by Oleg on 22 Aug 2015.
 *
 */
public class FavoritesClient {

    public static void main(String[] args) {

        Favorites f = new Favorites();

        f.putFavorite(String.class, "Java");
        f.putFavorite(Integer.class, 0xcafebabe);
        f.putFavorite(Class.class, Favorites.class);

        String favoriteString = f.getFavorite(String.class);
        int favoriteInteger = f.getFavorite(Integer.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);

        System.out.printf("%s %x %s%n", favoriteString, favoriteInteger,
                favoriteClass.getName());

    }
}