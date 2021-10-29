
package com.example.recyclerviewtest.modelos;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//TODO: (1) En Manifest.XML incluimos permiso de Internet
//TODO: (2) Creamos las clases de los modelos, que deben concordar con los datos de la API
public class Resultado {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("next")
    @Expose
    private String next;
    @SerializedName("previous")
    @Expose
    private Object previous;
    @SerializedName("results")
    @Expose
    private List<Pokemon> pokemons = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Resultado() {
    }

    /**
     * 
     * @param next
     * @param previous
     * @param count
     * @param pokemons
     */
    public Resultado(Integer count, String next, Object previous, List<Pokemon> pokemons) {
        super();
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.pokemons = pokemons;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

}
