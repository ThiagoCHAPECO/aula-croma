import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.CalculadoraFrete;

public class CalculadoFreteTest {

    CalculadoraFrete calculadora;


    @BeforeEach
    void prepara(){

        calculadora = new CalculadoraFrete();
    }
    
    @Test
    public void devCobrarFrete() {
        System.out.println(calculadora.calcular(20, false));
        System.out.println(calculadora.calcular(0, false));
        System.out.println(calculadora.calcular(230, true));
    }


    @Test
    public void naoDeveCobrarFrete(){
        assertEquals(0, calculadora.calcular(230, true));
    }
}
