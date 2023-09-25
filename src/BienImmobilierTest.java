import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BienImmobilierTest {


        Vendeur vendeur = new Vendeur("Patry", "Kylian", "Kylian.test@test.fr", "0606060606");
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        TypePiece salon = new TypePiece(TypePiece.SALON, true, true);
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        TypePiece salleDeBain = new TypePiece(TypePiece.SALLE_DE_BAIN, true, false);
        TypePiece Wc = new TypePiece(TypePiece.WC, true, false);
        TypePiece Garage = new TypePiece(TypePiece.GARAGE, false, false);
        TypePiece Cave = new TypePiece(TypePiece.CAVE, false, false);


    @Test
    public void testSurfaceHabitableMaison() {

        BienImmobilier testBienImmobilier = new Maison("4 rue des tests", "Annecy", "74000", vendeur, 250);

        testBienImmobilier.ajouterPiece(new PieceQuadrilatere(chambre, "0", 4, 3));
        testBienImmobilier.ajouterPiece(new PieceQuadrilatere(chambre, "0", 5, 3));
        testBienImmobilier.ajouterPiece(new PieceQuadrilatere(chambre, "0", 4, 7));
        testBienImmobilier.ajouterPiece(new PieceTriangulaire(cuisine, "0", 6, 2.3));
        testBienImmobilier.ajouterPiece(new PieceCirculaire(salon, "0", 2.1));
        testBienImmobilier.ajouterPiece(new PieceQuadrilatere(Wc, "0", 1.5, 2));
        testBienImmobilier.ajouterPiece(new PieceQuadrilatere(Cave, "-1", 3, 3));
        testBienImmobilier.ajouterPiece(new PieceQuadrilatere(Garage, "-1", 4, 3));

        assertEquals(null, 71.49734457253857, testBienImmobilier.surfaceHabitable(), 0);

    }

    @Test
    public void testSurfaceNonHabitable() {

        BienImmobilier testBienImmobilier = new Maison("4 rue des tests", "Annecy", "74000", vendeur, 250);

        testBienImmobilier.ajouterPiece(new PieceQuadrilatere(chambre, "0", 4, 3));
        testBienImmobilier.ajouterPiece(new PieceQuadrilatere(chambre, "0", 5, 3));
        testBienImmobilier.ajouterPiece(new PieceQuadrilatere(chambre, "0", 4, 7));
        testBienImmobilier.ajouterPiece(new PieceTriangulaire(cuisine, "0", 6, 2.3));
        testBienImmobilier.ajouterPiece(new PieceCirculaire(salon, "0", 2.1));
        testBienImmobilier.ajouterPiece(new PieceQuadrilatere(Wc, "0", 1.5, 2));
        testBienImmobilier.ajouterPiece(new PieceQuadrilatere(Cave, "-1", 3, 3));
        testBienImmobilier.ajouterPiece(new PieceQuadrilatere(Garage, "-1", 4, 3));
        assertEquals(null, 21.0, testBienImmobilier.surfaceNonHabitable(), 0);


        }
}
