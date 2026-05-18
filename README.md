# <img src="IMG_20260517_221647.jpg" width="45" align="center"> Pure3X - PS3 Emulator for Android

## 📌 Sobre o Projeto

**Pure3X** é um emulador nativo de PlayStation 3 para Android, desenvolvido **completamente do zero** com código C++ puro, sem qualquer cópia de projetos existentes. O projeto explora os limites do hardware mobile (ARM64) e é otimizado para dispositivos Android modernos.

> 🎯 **Objetivo Principal:** Criar um emulador funcional de PS3 que rode nativamente em smartphones Android, com foco em otimização de baixo nível e máximo desempenho.

---

## 🚀 Status Atual do Desenvolvimento

### 🎮 Versão: **v0.0.2-alpha** (Ativa)
* **Fase:** Prototipagem Avançada / Conceito Funcional
* **Público-alvo:** Desenvolvedores, entusiastas de emulação e testadores de hardware
* **Plataforma de Teste Principal:** Redmi 15 (Snapdragon 685 | HyperOS 3 / Android 16 Baklava)

---

## 💻 Arquitetura de Desenvolvimento (Pure3X Engine)

O projeto utiliza uma abordagem híbrida de alto desempenho, dividida em duas camadas complementares:

### 1️⃣ Frontend GUI (Java & AIDE)
* **Ambiente:** IDE móvel AIDE Modernizada + AndroidIDE
* **Linguagem:** Java com integração nativa ao ecossistema Android
* **Função:** 
  - Interface gráfica imersiva com tema escuro (`#050505`)
  - Menus de configuração e mapeamento de botões
  - ROM Loader para leitura de ISOs do cartão SD
  - Contador FPS em tempo real
  - Simulação visual de firmware PS3
* **Status v0.0.2:** ✅ Interface completamente redesenhada e estável

### 2️⃣ JNI Bridge & Core Backend (C++ Nativo)
* **Ambiente:** C++ puro integrado via CMake e Android NDK
* **Linguagem:** C++ 17/20 (código otimizado para ARM64)
* **Função:** 
  - Comunicação direta de baixo nível com o hardware
  - Emulação do processador Cell Engine do PS3
  - Renderização gráfica pesada via Vulkan
  - Gerenciamento de memória otimizado
  - Tradução de instruções CPU em tempo real
* **Arquivo Principal:** `Pure3x PS3.cxx`

---

## ⚡ Milestones & Histórico

### 🔴 **v0.0.1-alpha** - Hello World! ✅
* ✅ Arquitetura híbrida Java + C++ Nativo implementada
* ✅ Primeiro boot com sucesso absoluto na tela
* ✅ Validação de ferramentas (CMake, NDK moderno)
* ✅ Ambiente de compilação totalmente funcional

### 🔵 **v0.0.2-alpha** - Interface Imersiva & Firmware Base (ATUAL) 🔥
* ✅ **Visual Clean Console:** Layout radical com fundo preto absoluto (`#050505`)
* ✅ **Simulação de Performance:** Carregamento visual estável de Firmware 4.93 PS3
* ✅ **Taxa de Quadros:** Contador nativo calibrado em **60.0 FPS**
* ✅ **Tempo de Compilação Recorde:** Apenas **20 segundos** direto no celular
* ✅ **Estabilidade Android 16:** Eliminação completa de crashes de memória
* ✅ **Código 100% Original:** Desenvolvido do zero, sem dependências externas

---

## 🛠️ Tecnologias Utilizadas

| Componente | Tecnologia | Status |
|-----------|-----------|--------|
| **Linguagem (Backend)** | C++ 17/20 Puro | ✅ Ativo |
| **Linguagem (Frontend)** | Java | ✅ Ativo |
| **IDE de Desenvolvimento** | AIDE Modernizada + AndroidIDE | ✅ Em Uso |
| **Build System** | CMake | ✅ Otimizado |
| **SDK Nativo** | Android NDK Moderno | ✅ Integrado |
| **API Gráfica** | Vulkan (Preparação) | 🔄 Em Desenvolvimento |
| **Target OS** | Android 16 (HyperOS 3) | ✅ Full Support |
| **Arquitetura** | ARM64 | ✅ Otimizado |
| **Chipset Alvo** | Snapdragon 685 | ✅ Testado |

---

## ⚙️ Requisitos de Hardware (Para Testes)

Para compilar e testar o Pure3X com melhor desempenho, recomenda-se:

### Mínimos
- 📱 **Processador:** Snapdragon 680+ ou equivalente
- 💾 **RAM:** 4 GB mínimo (6 GB recomendado)
- 🔋 **Armazenamento:** 2 GB de espaço livre (para builds e ISOs)
- 🌡️ **Thermal Management:** Boa dissipação de calor

### Ideais
- 📱 **Processador:** Snapdragon 685+ / Dimensity 6020+
- 💾 **RAM:** 8 GB ou superior
- 🔋 **Armazenamento:** SSD rápido + cartão microSD classe 10+
- 🌡️ **Refrigeração:** Chipset com excelente gestão térmica

### Dispositivo de Teste Principal
- 📱 **Redmi 15** com Snapdragon 685
- 🔧 HyperOS 3 / Android 16 Baklava
- ✅ Compilação em 20 segundos

---

## 🎯 Roadmap (Próximos Passos)

### 📋 v0.0.3 (Próxima)
- [ ] Otimização completa do arquivo `Pure3x PS3.cxx`
- [ ] Remoção da ActionBar para tela cheia imersiva de console
- [ ] Substituição do ícone padrão pela Logo Oficial do Pure3X Engine
- [ ] Preparação do motor 2D para testes de carregamento de sprites
- [ ] Implementação básica de mapeamento de botões PS3

### 🔧 v0.0.4+
- [ ] Emulação preliminar do processador Cell Engine
- [ ] Tradução JIT das instruções da CPU
- [ ] Renderização 3D via Vulkan
- [ ] Suporte a audio do PS3
- [ ] Testes com ISOs reais do PS3

### 🚀 Longo Prazo
- [ ] Otimização JIT/Vulkan completa
- [ ] Subida gradual de compatibilidade com jogos
- [ ] Suporte a múltiplos chipsets
- [ ] Publicação de builds beta público

---

## 📦 Como Compilar Localmente

### Pré-requisitos
```bash
- Android NDK (versão 24+)
- CMake (versão 3.18+)
- AIDE ou AndroidIDE instalado
- Android SDK com API 31+
```

### Build no Celular (AIDE)
```bash
1. Abrir projeto no AIDE
2. Configurar CMake Path
3. Build > Compile Project
4. Tempo esperado: ~20 segundos
5. APK gerado em: /build/outputs/apk/
```

### Build no PC (Opcional)
```bash
mkdir build
cd build
cmake ..
make
```

---

## 🤝 Como Contribuir

Se você é desenvolvedor, entusiasta de emulação ou quer ajudar:

1. 🍴 **Faça um Fork** do projeto
2. 📝 **Abra uma Issue** com sugestões de otimização ou bugs encontrados
3. 💬 **Compartilhe feedback** sobre performance e estabilidade
4. 🐛 **Reporte bugs** com logs detalhados e informações do dispositivo
5. 📚 **Melhore a documentação** com suas descobertas

---

## 📱 Sistema de Logs & Performance

O Pure3X inclui um sistema nativo de logging que monitora:

- ⏱️ **FPS em tempo real** (Alvo: 60.0 FPS)
- 🧠 **Uso de memória** (Alocação dinâmica)
- 🌡️ **Temperatura do chipset**
- 📊 **Tempo de renderização** por frame
- 🔧 **Status de compilação** JIT

---

## 📄 Licença

Este projeto é desenvolvido como estudo pessoal de emulação de consoles. 
Respeite os direitos autorais e termos de serviço dos respectivos detentores de propriedade intelectual.

---

## 👨‍💻 Desenvolvedor

**Criado com dedicação e focado no futuro da emulação mobile!**

- 💻 Desenvolvido 100% do zero em C++
- 📱 Otimizado para ecossistema Xiaomi/Poco
- 🔥 Tempo de compilação recorde: 20 segundos
- 🎯 Manutenção contínua com updates semanais

---

*Made with ❤️ and pure C++ passion. From developer to developer!* 🚀📲🎮