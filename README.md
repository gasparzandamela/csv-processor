## 🧩 Desafio Técnico – Processamento e Validação de Arquivos CSV

O objetivo deste desafio é desenvolver uma aplicação Java capaz de ler, validar e categorizar arquivos CSV conforme regras específicas. A solução deve ser robusta, estruturada e construída utilizando o ecossistema Spring Boot.

### 🎯 Objetivo Geral
Implementar um sistema que processe arquivos CSV localizados em um diretório, valide seu conteúdo e os mova automaticamente para pastas distintas, dependendo da qualidade das informações.

---

## 📌 Requisitos do Desafio

### 🔹 1. Estrutura de diretórios
A aplicação deve trabalhar com três diretórios:

- `/PENDENTES` → Onde os arquivos CSV chegam.
- `/VALIDO` → Onde serão movidos os CSVs considerados válidos.
- `/INVALIDO` → Onde serão movidos os CSVs inválidos.

---

### 🔹 2. Regras de Validação dos Arquivos CSV

Cada arquivo CSV deve ser analisado e validado conforme os seguintes critérios:

1. **O arquivo não pode estar vazio**  
2. **Cada linha deve conter exatamente 4 colunas**, sendo elas:
   - `NUMERO_DA_VENDA`
   - `NOME_DO_CLIENTE`
   - `DATA_DA_VENDA`
   - `VALOR_DA_VENDA`
3. Os campos devem estar separados por `;`

Se todas as linhas atenderem às regras, o arquivo é considerado **válido**.  
Caso contrário, deve ser tratado como **inválido**.

---

### 🔹 3. Ação após a validação

Após avaliar o arquivo:

- Arquivos **válidos** → mover para `/VALIDO`  
- Arquivos **inválidos** → mover para `/INVALIDO`  

O sistema deve exibir mensagens claras no console indicando o status de cada arquivo processado.

---

### 🔹 4. Requisitos Técnicos

- Linguagem: **Java 8+**
- Framework: **Spring Boot**
- IDE sugerida: **VS Code**
- Padrão arquitetural: **MVP (Model–View–Presenter)**
- Estilo de código: limpo, claro e comentado
- Controle de versão: **Git**, com uso de commits semânticos
- Entrega final: projeto executável através de um arquivo `.jar`

---

### 🔹 5. Funcionalidade adicional (extra do desafio)

A aplicação também deve oferecer um **modo interativo** via terminal, onde o usuário pode:

1. Informar os dados de uma venda  
2. Gerar automaticamente um arquivo CSV  
3. O arquivo criado deve ser validado pelo mesmo mecanismo  
4. Deve ser movido automaticamente para **VALIDO** ou **INVALIDO**

---

## 🏁 Resultado Esperado

Uma aplicação 100% funcional, capaz de:

- Ler CSVs automaticamente  
- Validar conteúdo  
- Classificar arquivos válidos e inválidos  
- Gerar CSVs interativos  
- Manter uma arquitetura limpa e escalável  
- Entrega pronta para produção com `.jar` executável  
