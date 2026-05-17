## 💻 Arquitetura de Desenvolvimento (Pure3X Core)

O projeto está sendo construído do zero utilizando uma abordagem híbrida para garantir o máximo de desempenho no hardware mobile (ARM64), dividindo-se em duas camadas principais:

### 1. Frontend GUI (Java & AIDE)
* **Ambiente:** Desenvolvido nativamente no ecossistema Android usando a IDE móvel **AIDE**.
* **Função:** Interface gráfica, menus, configurações, mapeamento de botões e o ROM Loader para escanear as ISOs do Cartão SD.
* **Objetivo v0.0.1:** Garantir uma inicialização limpa e estável da interface nativa.

### 2. JNI Bridge (Java Native Interface)
* **Função:** A ponte de comunicação que traduz os comandos da interface em Java e os envia direto para o motor em C++ com latência quase zero.

### 3. Backend Engine (C++)
* **Lógica:** Estrutura puramente lógica e matemática para simular o processador Cell do PS3.
* **Módulos:** Core de Memória virtualizada, Core de Vídeo (Pipeline de renderização 720p/1080p) e Sound Core (Áudio de alta fidelidade).

---

## 📁 Estrutura Inicial de Pastas do Código
* 📁 `app/src/main/java/` -> Código fonte em **Java** (Interface e Menus no AIDE).
* 📁 `app/src/main/jni/` -> Código fonte em **C++** (Motores e Ponte JNI).
