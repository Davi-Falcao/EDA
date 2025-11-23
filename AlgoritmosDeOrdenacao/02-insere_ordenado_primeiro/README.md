# 02 – Insere Ordenado (Primeiro Elemento)

Este diretório contém a solução de um exercício complementar ao anterior:  
agora o problema é **inserir o primeiro elemento na posição correta** de um vetor em que **todas as posições de `1` até `n-1` já estão ordenadas em ordem crescente**.

Arquivo principal:

- `Solucao.java`

---

## 🎯 Objetivo do exercício

- Treinar a operação de **inserção em vetor ordenado**, mas desta vez começando pelo **primeiro elemento**.
- Trabalhar com:
  - deslocamento de elementos para a esquerda;
  - raciocínio sobre laços que caminham do início para frente;
  - manutenção de invariantes de ordenação.

---

## 🧠 Comportamento esperado de `Solucao.java`

Em termos gerais, o programa:

1. **Lê** da entrada padrão um vetor de inteiros.
2. Assume que as posições `1` até `n-1` já formam um **subvetor ordenado em ordem crescente**, e que o elemento na posição `0` é o valor “fora do lugar” que deve ser inserido.
3. Guarda o **primeiro elemento** em uma variável auxiliar, por exemplo `valor`.
4. Percorre o vetor a partir da posição `1`, procurando a **posição correta** para inserir `valor` (ou até encontrar alguém maior que ele).
5. Desloca os elementos **uma posição para a esquerda**, abrindo espaço para `valor`.
6. Insere `valor` na posição adequada.
7. **Imprime** o vetor resultante, agora completamente ordenado.

Em vez de ser o “último passo” típico do Insertion Sort, aqui você está simulando a inserção de um elemento que estava na frente, em um sufixo já ordenado.

---

## 📊 Complexidade

- **Tempo:** `O(n)` no pior caso (por exemplo, quando o primeiro elemento é o maior de todos).
- **Espaço adicional:** `O(1)`, utilizando apenas uma variável auxiliar.

---

## 📌 Observações

- Este exercício ajuda a fixar a ideia de que a inserção em vetores ordenados pode ser feita tanto a partir do início quanto do fim, desde que o **subvetor restante esteja ordenado**.
- A lógica é análoga à do outro exercício (`02-insere_ordenado_ultimo`), mas “espelhada” em relação à posição do elemento a ser inserido.
