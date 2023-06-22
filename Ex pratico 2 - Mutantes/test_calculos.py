import unittest
from calculos import soma, subtracao, multiplicacao

class TestCalculos(unittest.TestCase):

    def test_soma(self):
        self.assertEqual(soma(2, 3), 5)

    def test_subtracao(self):
        self.assertEqual(subtracao(5, 3), 2)

    def test_multiplicacao(self):
        self.assertEqual(multiplicacao(2, 3), 6)

if __name__ == '__main__':
    unittest.main()