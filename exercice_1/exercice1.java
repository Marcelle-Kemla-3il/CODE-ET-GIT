public class FactureManager {

    // Calcul le total d'une facture
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        
         //calcul du total brut
        double total = quantite * prixUnitaire;
           
            //tableau de reduction
        double reduction = obtenirReduction(typeProduit);
        
         //formule reduction
         total -= total*reduction

        //application de reduction pour les gros
        if(total > 1000){
            total -= total *0,05;
        }

        return total;

        private double obtenirReduction(String type produit){
            switch (typeProduit) {
                case "Alimentation":
                    return 0.5;
                case "Electronique":
                    return 0.1;
                    case "Luxe":
                        return 0.15;
                        default:
                            return 0;
            }
        }
    }
}

      