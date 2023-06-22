from Retangulo import calcular_area_retangulo
import unittest

class TestRetang(unittest.TestCase):

    def test_calcular_area_retangulo(self):
        # Caso de teste 1: Comprimento = 4, Largura = 5
        assert calcular_area_retangulo(4, 5) == 20

        # Caso de teste 2: Comprimento = 7, Largura = 3
        assert calcular_area_retangulo(7, 3) == 21

        # Caso de teste 3: Comprimento = 0, Largura = 10
        assert calcular_area_retangulo(0, 10) == 0

        # Caso de teste 4: Comprimento = 2, Largura = -5 (valor inválido)
        assert calcular_area_retangulo(2, -5) != 0

if __name__ == '__main__':
    unittest.main()