import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vev.Ranking;
import com.vev.Record;


public class RankingTest {
    /* entra - nome, pontos
     * sai - colocado no podio ou n
     * 
     * MENOS DE 10 JOGADORES INSERIDOS
     *  INSERE O JOGADOR
     * MAIS DE 10 JOGADORES INSERIDOS
     *  SO ENTRA SE A PONTUAÇÃO FOR MAIOR QUE O ULTIMO COLOCADO &
     *  JOGADOR COM A MENOR PONTUAÇÃO É ELIMINADO
     * ORDENADOS EM ORDEM DECRESCENTE
     * 
     * não dá pra comentar nos imports ;-;
     * Assertion.* == Any Assertion
     * 
     */
    private Ranking ranking;

    @BeforeEach
    public void inicializa_ranking_vazio() {
        ranking = new Ranking();
    }

    @Test
    public void adiciona_novo_record_ranking_nao_cheio() {
        Record record = new Record("A", 1);
        assertTrue(ranking.add(record));
        assertEquals(1, ranking.numRecords());
        assertEquals(record, ranking.getScore(0));
    }

    @Test
    public void adiciona_novo_record_maior_ranking_cheio() {
        for (int i = 0; i < 10; i++) {
            ranking.add(new Record("A" + i, i));
        }
        Record novo = new Record("B11", 1000);
        assertTrue(ranking.add(novo));
        assertEquals(novo, ranking.getScore(0));
    }

    @Test
    public void adiciona_novo_record_menor_ranking_cheio() {
        for (int i = 0; i < 10; i++) {
            ranking.add(new Record("A" + i, i));
        }
        Record novo = new Record("B11", 0);
        ranking.add(novo);
        for (int i = 0; i < ranking.numRecords(); i++) {
            assertNotEquals(novo, ranking.getScore(i));
        }
    }
    @Test
    public void adiciona_varios_record_tamanho_eh_10() {
        for (int i = 0; i < 20; i++) {
            ranking.add(new Record("A" + i, i));
        }
        assertEquals(10, ranking.numRecords());
    }
}
