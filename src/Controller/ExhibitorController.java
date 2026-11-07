/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import model.Exhibitor;
import util.ExhibitorIdGenerator;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ExhibitorController {
    
     private ArrayList<Exhibitor> exhibitors;
    private ExhibitorIdGenerator idGenerator;

    public ExhibitorController() {
        exhibitors = new ArrayList<>();
        idGenerator = new ExhibitorIdGenerator();
    }

    // ADD
    public Exhibitor addExhibitor(String name, String medium,
                                  int artworkCount, String status) {

        String id = idGenerator.generateId();

        Exhibitor exhibitor = new Exhibitor(
            id, name, medium, artworkCount, status
        );

        exhibitors.add(exhibitor);

        return exhibitor;
    }

    // REMOVE
    public boolean removeExhibitor(String id) {

        Exhibitor exhibitor = searchExhibitor(id);

        if (exhibitor != null) {
            exhibitors.remove(exhibitor);
            return true;
        }

        return false;
    }

    // SEARCH
    public Exhibitor searchExhibitor(String id) {

        for (Exhibitor exhibitor : exhibitors) {

            if (exhibitor.getExhibitorId()
                    .equalsIgnoreCase(id.trim())) {
                return exhibitor;
            }
        }

        return null;
    }

    // UPDATE
    public boolean updateExhibitor(String id, String name,
                                   String medium, int artworkCount,
                                   String status) {

        Exhibitor exhibitor = searchExhibitor(id);

        if (exhibitor != null) {

            exhibitor.setName(name);
            exhibitor.setMedium(medium);
            exhibitor.setArtworkCount(artworkCount);
            exhibitor.setStatus(status);

            return true;
        }

        return false;
    }

    // GET ALL
    public ArrayList<Exhibitor> getAllExhibitors() {
        return new ArrayList<>(exhibitors);
    }
    
}
