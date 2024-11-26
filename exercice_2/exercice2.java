public class GestionnaireNotes {

    // Méthode pour afficher les notes et la moyenne d'un étudiant
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affichage des notes
        afficherNotes(nomEtudiant, notes);
        
        // Calcul et affichage de la moyenne
        afficherMoyenne(notes);
    }

    // Méthode pour afficher les notes
    private void afficherNotes(String nomEtudiant, int[] notes) {
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    // Méthode pour calculer et afficher la moyenne
    private void afficherMoyenne(int[] notes) {
        double moyenne = calculerMoyenne(notes);
        System.out.println("Moyenne : " + moyenne);
    }

    // Méthode pour calculer la moyenne d'un tableau de notes
    private double calculerMoyenne(int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note; // Ajout de chaque note à la somme
        }
        return (double) somme / notes.length; // Calcul de la moyenne
    }
}
