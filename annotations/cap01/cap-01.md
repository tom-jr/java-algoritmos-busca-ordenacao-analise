# ALGORITMOS

## Encontrando o Menor valor

O inicio do cap nos instiga a entender que muitos problemas de algoritmo envolve ordenação.
Maior preço, menor preço, caminho mais curto, horário mais próximo de um evento. Se analisarmos 
bem esses problemas eles em suas soluções tem o envolvimento da ordenação.

Todo problema que envolve as palavras chaves: **quem/algo**, **mais**, __menos__ tem ordenação em sua
solução.

## Produto mais barato
Problema:
Tenho 5 opções de carros a venda e desejo comprar o mais barato

```json
[
  {
    "nome": "Lamborghini",
    "valor": 1000000.00
  },
  {
    "nome": "Jipe",
    "valor": 46000.00
  },
  {
    "nome": "Brasilia",
    "valor": 16000.00
  },
  {
    "nome": "Smart",
    "valor": 46000.00
  },
  {
    "nome": "Fusca",
    "valor": 17000.00
  }
]
```

O livro pede para escrever como eu cheguei a conclusão do livro mais barato.
Eu olhei para todos os valores e pude notar que a Brasilia possui a **menor** unidade de valor.

## Encontrando o mais barato na cabeça
O livro da enfase para o fato de termos olhado para cada carro e suas propriedades. Para que com esses dados
nossa mente pudesse processar as informações e assim definir o menor valor dentre os lidos.
A chave da questão seria olhar para as propriedades de todos os carros

A solução logica é percorrer todos os carros, salva a informação do primeiro veiculo e denominá-lo como o menor
e ir comparando com o próximo carro. E caso o próximo tenha o valor menor, o mesmo substitui o titulo de carro 
com menor valor.

## Escrevendo o Algoritmo

veja o algoritmo no [exemplo](Exe_0.java)

quando eu percorro um array 5 elementos eu vou estar percorrendo do 0 até 4 **inclusive** ou estarei percorrendo do 0 
até 5 **exclusive**

algoritmo conforme o book: [exemplo](Exe_1.java)
