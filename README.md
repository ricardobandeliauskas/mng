# [mng] - CRM/ERP para Empresas de Serviços

_A forma mais simples para empresas de serviços brasileiras gerirem todo o seu fluxo de trabalho com clientes, desde a proposta e gestão do projeto até ao recebimento._

---

## 📝 Sobre o Projeto

Este projeto é a materialização de uma plataforma integrada de CRM e ERP, desenhada especificamente para as necessidades de micro e pequenas empresas (PMEs) baseadas em serviços no Brasil.

O mercado atual é dominado por soluções generalistas que, ao tentarem servir a todos, acabam por ser complexas e sobrecarregadas para o setor de serviços. A nossa proposta de valor é uma **simplicidade radical** e um foco total no fluxo de trabalho essencial deste nicho: **"Do Projeto ao Caixa"**.

O MVP (Produto Mínimo Viável) concentra-se em resolver as dores principais deste público:

- ✅ **Gestão de Clientes e Projetos:** Um funil de vendas visual e simplificado, focado na aquisição e gestão de projetos.
- ✅ **Gestão Financeira do Projeto:** Criação de propostas, faturas e controlo de pagamentos de forma intuitiva.
- ✅ **Conformidade Fiscal Simplificada:** Emissão de Nota Fiscal de Serviço (NFS-e) de forma transparente e integrada.

## 🚀 Tecnologias Utilizadas

A arquitetura foi escolhida para maximizar a produtividade e a partilha de código, utilizando um ecossistema unificado em torno da linguagem Kotlin.

- **Backend:**(https://spring.io/projects/spring-boot) + [Kotlin](https://kotlinlang.org/)
- **Lógica Partilhada:** [Kotlin Multiplatform (KMM)](https://kotlinlang.org/docs/multiplatform.html)
- **Frontend Web:** [Vue.js](https://vuejs.org/)
- **App Móvel:** [Compose Multiplatform](https://www.jetbrains.com/pt-br/compose-multiplatform/)
- **Base de Dados:**(https://www.postgresql.org/) (Produção) & [H2](https://www.h2database.com/html/main.html) (Desenvolvimento/Testes)
- **Build Tool:**([https://docs.gradle.org/current/userguide/kotlin_dsl.html](https://docs.gradle.org/current/userguide/kotlin_dsl.html))

## 🏛️ Arquitetura "Triple-Dip" com KMM

O coração técnico deste projeto é a utilização do Kotlin Multiplatform (KMM) para partilhar não apenas a lógica de negócio, mas também os modelos de dados e as regras de validação entre todas as pontas da aplicação.

O módulo `commonMain` do KMM contém o núcleo da aplicação e é utilizado como uma dependência em três locais:

1. **Backend (JVM):** Integrado diretamente na aplicação Spring Boot.
2. **Web (JS):** Compilado para JavaScript e consumido pela aplicação Vue.js.
3. **Móvel (Nativo):** Compilado como um framework nativo para as aplicações Android e iOS (via Compose Multiplatform).

Isto significa que uma regra de negócio é escrita **uma única vez** e executada de forma nativa em todas as plataformas, eliminando a duplicação de código e reduzindo drasticamente a possibilidade de erros.

## 🏁 Como Começar

Para ter uma cópia do projeto a correr localmente para desenvolvimento e testes, siga estes passos.

### Pré-requisitos

Certifique-se de que tem o seguinte software instalado na sua máquina:

- JDK 17 ou superior (e.g.,([https://openjdk.java.net/](https://www.google.com/search?q=https://openjdk.java.net/)))
- Node.js e npm/yarn
- Android Studio (para o desenvolvimento móvel)
- Xcode (necessário para correr o simulador de iOS)

### Instalação e Execução

1. **Clone o repositório:**sh git clone [https://github.com/seu-usuario/nome-do-projeto.git](https://www.google.com/search?q=https://github.com/seu-usuario/nome-do-projeto.git) cd nome-do-projeto

2. **Executar o Backend (API):**

    - Abra o projeto numa IDE como o IntelliJ IDEA.
    - Encontre e execute a classe principal da aplicação Spring Boot.
    - A API estará disponível em `http://localhost:8080`.
3. **Executar o Frontend (Web):**

   Bash

    ```
    # Navegue para a pasta do projeto web
    cd web-app
    
    # Instale as dependências
    npm install
    
    # Inicie o servidor de desenvolvimento
    npm run dev
    ```

    - A aplicação web estará disponível em `http://localhost:5173` (ou outra porta indicada no terminal).
4. **Executar a Aplicação Móvel:**

    - Abra a raiz do projeto no Android Studio.
    - Deixe o Gradle sincronizar as dependências.
    - Selecione o alvo `androidApp` e um emulador Android para correr a versão Android.
    - Selecione o alvo `iosApp` e um simulador iOS (requer macOS e Xcode) para correr a versão iOS.

## 🗺️ Roteiro do MVP

O nosso foco para os próximos 6 meses é construir as funcionalidades essenciais do fluxo "Do Projeto ao Caixa". Veja o nosso progresso e as próximas tarefas no nosso quadro Kanban.

## 🤝 Contribuir

Contribuições são o que tornam a comunidade open source um lugar incrível para aprender, inspirar e criar. Quaisquer contribuições que você fizer serão **muito apreciadas**.

Se tiver uma sugestão para melhorar isto, por favor, faça um fork do repositório e crie um pull request. Você também pode simplesmente abrir uma issue com a tag "melhoria". Não se esqueça de dar uma estrela ao projeto! Obrigado novamente!

2. Faça um Fork do Projeto
3. Crie a sua Feature Branch (`git checkout -b feature/AmazingFeature`)
4. Faça o Commit das suas alterações (`git commit -m 'Add some AmazingFeature'`)
5. Faça o Push para a Branch (`git push origin feature/AmazingFeature`)
6. Abra um Pull Request