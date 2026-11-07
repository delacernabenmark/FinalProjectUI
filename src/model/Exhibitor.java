/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Exhibitor {
   
     private String exhibitorId;
    private String name;
    private String medium;
    private int artworkCount;
    private String status;

    public Exhibitor(String exhibitorId, String name,
                     String medium, int artworkCount, String status) {

        this.exhibitorId = exhibitorId;
        this.name = name;
        this.medium = medium;
        this.artworkCount = artworkCount;
        this.status = status;
    }

    public String getExhibitorId() {
        return exhibitorId;
    }

    public String getName() {
        return name;
    }

    public String getMedium() {
        return medium;
    }

    public int getArtworkCount() {
        return artworkCount;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public void setArtworkCount(int artworkCount) {
        this.artworkCount = artworkCount;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
