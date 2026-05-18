# <img src="IMG_20260517_221647.jpg" width="45" align="center"> Pure3X (PS3 Emulator for Android)

## 📌 Sobre o Projeto
O Pure3X é um projeto experimental focado no desenvolvimento e estudo da emulação do console PlayStation 3 (PS3) para a plataforma Android. O objetivo principal é explorar os limites do hardware móvel atual e entender a arquitetura complexa do Cell Broadband Engine rodando diretamente em dispositivos ARM64.

Como todo grande projeto de emulação, estamos começando do absoluto zero. O desenvolvimento será feito de forma transparente, degrau por degrau, focando inicialmente na estrutura base do aplicativo e na renderização dos primeiros elementos gráficos.

---

## 💻 Arquitetura de Desenvolvimento (Pure3X Core)
O projeto está sendo construído do zero utilizando uma abordagem híbrida para garantir o máximo de desempenho no hardware mobile (ARM64), dividindo-se em duas camadas principais:

### 1. Frontend GUI (Java & AIDE)
* **Ambiente:** Desenvolvido nativamente no ecossistema Android usando a IDE móvel AIDE.
* **Função:** Interface gráfica, menus, configurações, mapeamento de botões e o ROM Loader para escanear as ISOs do Cartão SD.
* **Objetivo v0.0.1:** Garantir uma inicialização limpa e estável da interface nativa.

### 2. JNI Bridge (Java Native Interface) & Core Backend
* **Ambiente:** Código nativo em C++ integrado via CMake e Android NDK.
* **Função:** Comunicação direta de baixo nível com o hardware, onde será processada a tradução das instruções da CPU (Cell Engine) e a renderização gráfica pesada.

---

## 🛠️ Status do Desenvolvimento
* **Versão Atual:** v0.0.1-alpha
* **Fase:** Inicial / Prova de Conceito (PoC)
* **Público-alvo:** Desenvolvedores, entusiastas e testadores de hardware.

> ⚠️ **Nota:** Por estar na versão 0.0.1, o projeto ainda não executa jogos comerciais. O foco atual está na inicialização da interface, configuração das ferramentas de compilação e mapeamento dos módulos iniciais do sistema.

---

## 🚀 Cronograma de Atualizações (Roadmap)
O desenvolvimento do Pure3X seguirá uma evolução constante e semanal:

* **Semana 1-2 (Versão 0.0.1):** Estrutura inicial do aplicativo Android, configuração do ambiente de build (CMake/NDK) e interface básica.
* **Semana 3-4 (Versão 0.0.2):** Primeiros testes de alocação de memória e mapeamento preliminar das instruções da CPU do PS3.
* **A Longo Prazo:** Otimização de compilação JIT/Vulkan e subida gradual de compatibilidade, seguindo os passos históricos de grandes emuladores de código aberto.

---

## ⚙️ Requisitos Estimados (Para Testes Iniciais)
Para acompanhar e compilar os testes futuros, recomenda-se o uso de chipsets de alto desempenho com boa eficiência térmica e gerenciamento de bateria, especialmente processadores Snapdragon/Dimensity topo de linha modernos.

---

## 🤝 Como Contribuir
Se você estuda programação, desenvolvimento de emuladores ou quer ajudar com relatórios de bugs gráficos e logs de performance assim que os primeiros builds forem liberados:

1. Faça um **Fork** do projeto.
2. Abra uma **Issue** detalhando sugestões de otimização de código.
3. Compartilhe seus feedbacks para evoluirmos esse projeto passo a passo.
