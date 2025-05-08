<h1 align="center">🧮 Juan Cursino - Desenvolvedor de Sistemas</h1>

<p align="center">
  Seja bem-vindo! Sou o <strong>Juan Cursino</strong>, um entusiasta de <strong>tecnologia</strong>, movido por desafios e apaixonado por criar soluções inteligentes.<br>
  Meu foco está em <strong>Inteligência Artificial</strong>, <strong>aplicações web modernas</strong> e <strong>experiências que realmente fazem a diferença</strong>.
</p>

<p align="center">
  Aqui você vai encontrar meus projetos, ideias em andamento e um pouco do que venho construindo ao longo da minha jornada como <strong>dev full stack</strong> e <strong>Scrum Master</strong>.
</p>

<p align="center">
  Explore, clique e fique à vontade para me chamar para um café (ou uma call 👨‍💻).
</p>
<br><br/>

---


<h1 align="center">🚀 GeoHood – Inteligência Geoespacial para o Agronegócio</h1>



<div align="center" style="max-width: 800px; margin: auto; text-align: left;">
<h2 align="center">📝 Descrição</h2>
<p>
A plataforma foi desenvolvida como uma solução web para a gestão de fazendas, com foco na visualização geoespacial e no mapeamento de áreas produtivas. Um dos principais recursos é o suporte ao upload de arquivos no formato GeoJSON, que contêm informações espaciais sobre os limites das fazendas e subdivisões como talhões. Após o upload, os dados são processados automaticamente e exibidos de forma interativa em um mapa, permitindo ao usuário visualizar, editar e complementar as informações associadas a cada área. Além disso, a plataforma oferece ferramentas para registrar e acompanhar ocorrências agrícolas, como a presença de ervas daninhas, diretamente sobre o mapa. O desafio central está em proporcionar uma experiência intuitiva e eficiente para que técnicos e gestores possam manipular dados espaciais com facilidade, garantindo precisão nas tomadas de decisão.


</p>

<div align="center">

#### API para a VISIONA ESPACIAL:

[GeoHood](https://github.com/FatecCoderHood/4_GeoHood) - Este projeto envolve o uso de <strong>tecnologias geoespaciais</strong> para a gestão e visualização de fazendas, com suporte a <strong>GeoJSON</strong> e a implementação de funcionalidades como mapeamento e análise de dados geográficos.

[![ReadMe Card](https://github-readme-stats.vercel.app/api/pin/?username=FatecCoderHood&repo=4_GeoHood)](https://github.com/FatecCoderHood/4_GeoHood)

</div>

<h2 align="center">🧰 Tecnologias</h2>
<p><strong>Frontend:</strong> Vue.js, Vuetify, Leaflet</p>
<p><strong>Backend:</strong> Java 17, Spring Boot</p>
<p><strong>Outros:</strong> YouTrack, Git, GitHub, metodologia ágil (Scrum)</p>
<details>
  <summary>🛠️ Tecnologias Detalhadas</summary>
    <strong>Java</strong><br>
      Linguagem de programação amplamente usada para desenvolvimento da aplicação, utilizada somente no backend. Foi importante para criar uma aplicação robusta e escalável.
  
<strong>Spring</strong><br>
      Framework para desenvolvimento de aplicações Java, ofereceu suporte para injeção de dependências, gerenciamento de transações e criação de APIs REST, facilitando a criação de aplicações web e microserviços.
 
 <strong>HTML</strong><br>
      Linguagem de marcação utilizada na construção de páginas na Web.
  
<strong>CSS</strong><br>
      Linguagem de estilo usada para descrever a apresentação de documentos HTML. Foi importante para estilizar e formatar páginas web, melhorando a aparência e a experiência do usuário.
  
<strong>Vue.js</strong><br>
      Framework JavaScript para construção de interfaces de usuário interativas. Facilita a criação de aplicações web dinâmicas e reativas com uma arquitetura de componentes.
    
  <strong>MySQL</strong><br>
      Sistema de gerenciamento de banco de dados relacional. Crucial para armazenar e gerenciar dados de forma estruturada em aplicações web.
    
  <strong>Git</strong><br>
      Sistema de controle de versão distribuído. Essencial para rastrear mudanças no código-fonte e colaborar com outros desenvolvedores de forma eficiente.
    
  <strong>GitHub</strong><br>
      Plataforma de hospedagem para projetos que utilizam Git. Importante para o compartilhamento de código, colaboração e controle de versão em projetos de software.
    
  <strong>Visual Studio Code</strong><br>
      Editor de código-fonte leve, mas poderoso, disponível para Windows, macOS e Linux.

 <strong>YouTrack</strong><br> Gerenciamento de tarefas e acompanhamento do progresso com metodologias ágeis.
    
</details>

<h2 align="center"> 🙋‍♂️ Contribuições Pessoais </h2>

<div align="center" style="text-align: left; display: inline-block; max-width: 800px;">

<details>
  <summary>🔄 Wizard de Cadastro de Fazendas</summary>
  <p><strong>Objetivo:</strong> Criar um fluxo guiado para o usuário cadastrar fazendas com base em arquivos GeoJSON.</p>
  <p><strong>Etapas Implementadas:</strong></p>
  Upload e leitura do arquivo.
  Extração automática do nome da fazenda e propriedades dos talhões.</li>
    <li>Formulários dinâmicos para complementação e edição dos dados.</li>
    <li>Tela final de resumo antes do envio.</li>
  <p><strong>Destaques Técnicos:</strong></p>
    <li>Comunicação entre componentes com <code>emit</code> e <code>v-model</code>.</li>
    <li>Controle de estado com objetos reativos.</li>
    <li>Validações usando regras personalizadas do Vuetify.</li>
</details>

<details>
  <summary>🌱 Marcação e Edição de Ervas Daninhas</summary>
  <p><strong>Objetivo:</strong> Permitir que o usuário desenhe áreas com ocorrências diretamente no mapa.</p>
  <p><strong>Funcionalidades:</strong></p>
    <li>Ferramenta de desenho usando Leaflet Draw.</li>
    <li>Armazenamento das geometrias em formato GeoJSON.</li>
    <li>Permitir remoção e modificação das regiões afetadas.</li>
  <p><strong>Destaques Técnicos:</strong></p>
    <li>Controle total dos eventos de desenho (<code>draw:created</code>, <code>draw:deleted</code>).</li>
    <li>Atualização do estado global da aplicação com os dados desenhados.</li>
    <li>Integração entre frontend e backend para envio dessas informações.</li>
</details>

<details>
  <summary>📦 Manipulação de GeoJSON no Frontend</summary>
  <p><strong>Objetivo:</strong> Processar e exibir corretamente os dados recebidos no formato GeoJSON.</p>
  <p><strong>Etapas:</strong></p>
    <li>Leitura do arquivo enviado pelo usuário.</li>
    <li>Extração de propriedades como nome da fazenda, cultura, safra.</li>
    <li>Conversão dos polígonos para exibição via Leaflet.</li>
  <p><strong>Destaques Técnicos:</strong></p>
    <li>Uso do <code>FileReader</code> para converter o conteúdo do arquivo em JSON.</li>
    <li>Preenchimento automático dos formulários com os dados extraídos.</li>
    <li>Renderização das geometrias no mapa com <code>L.geoJSON()</code>.</li>
</details>

<details>
  <summary>👨‍💼 Atuação como Scrum Master</summary>
  <p><strong>Objetivo:</strong> Garantir organização e eficiência na condução do time.</p>
  <p><strong>Responsabilidades:</strong></p>
    <li>Facilitação das cerimônias Scrum (daily, planning, review).</li>
    <li>Acompanhamento de tarefas e impedimentos no YouTrack.</li>
    <li>Mediação entre entregas técnicas e expectativas do cliente.</li>
  <p><strong>Resultados:</strong></p>
    <li>Equipe alinhada, entregando valor em ciclos curtos e bem definidos.</li>
</details>

</div>

<h2 align="center">📚 Aprendizados Efetivos</h2>

  <li>Criação de interfaces dinâmicas com Vue 3 e Vuetify.</li>
  <li>Integração entre mapa (Leaflet) e dados estruturados (GeoJSON).</li>
  <li>Organização de projetos ágeis com foco em MVP.</li>
  <li>Comunicação entre áreas técnicas e não técnicas no papel de Scrum Master.</li>


</div>
<br></br>

---

<h1 align="center">📢 NewsHub – Central de Notícias Estratégicas</h1>  <div align="center" style="max-width: 800px; margin: auto; text-align: left;"> <h2 align="center">📝 Descrição</h2> <p> NewsHub é uma plataforma web criada para a captação, organização e análise de notícias estratégicas. A aplicação permite que empresas monitorem tópicos relevantes por meio de APIs de notícias e cadastro manual, mantendo um repositório centralizado com recursos de pesquisa avançada. Entre as principais funcionalidades, destaca-se o sistema de regionalismos e sinônimos, que identifica variações linguísticas como “mandioca” e “aipim”, enriquecendo a busca e a categorização das informações. A interface é intuitiva e responsiva, com filtros dinâmicos que facilitam o acesso rápido ao conteúdo mais relevante. Ideal para uso em áreas como inteligência de mercado, agronegócio e comunicação estratégica. </p> <div align="center">
<div align="center">

#### API para a GSW:

[NewsHub](https://github.com/FatecCoderHood/GSW_API) - Sistema para captura e armazenamento de <strong>notícias estratégicas</strong> e dados relevantes associados, desenvolvido em <strong>Spring Boot</strong>.

[![ReadMe Card](https://github-readme-stats.vercel.app/api/pin/?username=FatecCoderHood&repo=GSW_API)](https://github.com/FatecCoderHood/GSW_API)

</div>


</div> <h2 align="center">🧰 Tecnologias</h2> <p><strong>Frontend:</strong> Vue.js, Vuetify</p> <p><strong>Backend:</strong> Java 17, Spring Boot</p> <p><strong>Outros:</strong> YouTrack, Git, GitHub, metodologia ágil (Scrum)</p> <details> <summary>🛠️ Tecnologias Detalhadas</summary> <strong>Java</strong><br> Usado no backend para garantir robustez e escalabilidade. <br><br> <strong>Spring Boot</strong><br> Framework para criação de APIs RESTful e arquitetura limpa. <br><br> <strong>Vue.js e Vuetify</strong><br> Criação da interface responsiva e amigável para visualização e cadastro de notícias. <br><br> <strong>Git e GitHub</strong><br> Controle de versão e colaboração entre os membros da equipe. <br><br> <strong>YouTrack</strong><br> Gerenciamento de tarefas e acompanhamento do progresso com metodologias ágeis. </details> <h2 align="center">🙋‍♂️ Contribuições Pessoais</h2> 
<details> <summary>📥 Cadastro e Listagem de Notícias</summary> <p><strong>Objetivo:</strong> Criar um sistema flexível de inserção e visualização de notícias estratégicas.</p> <p><strong>Funcionalidades:</strong></p> <li>Formulário dinâmico com campos de título, data, conteúdo e fonte.</li> <li>Listagem com filtros por palavra-chave, data e tags.</li> <p><strong>Destaques Técnicos:</strong></p> <li>Utilização de <code>v-model</code> para binding de formulários.</li> <li>Integração com API REST usando <code>Axios</code>.</li> </details> <details> <summary>🧠 Sistema de Sinônimos e Regionalismos</summary> <p><strong>Objetivo:</strong> Enriquecer a pesquisa por notícias com base em variações regionais de termos.</p> <p><strong>Implementações:</strong></p> <li>Relacionamento entre palavras principais e seus sinônimos no banco.</li> <li>Integração com o mecanismo de busca para considerar termos equivalentes.</li> <p><strong>Destaques Técnicos:</strong></p> <li>Modelo relacional com JPA e Spring Data.</li> <li>Filtros dinâmicos no frontend com base em mapeamentos semânticos.</li> </details> <details> <summary>👨‍💼 Atuação como Scrum Master</summary> <p><strong>Responsabilidades:</strong></p> <li>Facilitação de dailies e planning.</li> <li>Uso do YouTrack para acompanhamento de progresso.</li> <li>Engajamento do time e resolução de impedimentos.</li> </details> <h2 align="center">📚 Aprendizados Efetivos</h2> <li>Integração completa frontend-backend com Java e Vue.js.</li> <li>Aplicação de boas práticas REST na construção da API.</li> <li>Desenvolvimento de mecanismos de busca semântica com foco em regionalismos.</li> <li>Liderança de time ágil com base em Scrum.</li> </div> <br></br>

---

<h1 align="center">☁️ Zeus – Plataforma para Análise Climática</h1>
<div align="center" style="max-width: 800px; margin: auto; text-align: left;"> <h2 align="center">📝 Descrição</h2> <p> Zeus é uma aplicação focada na análise e visualização de dados climáticos históricos a partir de arquivos CSV. Voltado para pesquisadores e estudantes, o sistema permite importar grandes volumes de dados meteorológicos e exibi-los de forma organizada, incluindo representações estatísticas como gráficos boxplot. A aplicação foi desenvolvida com Java e JavaFX, prezando pela experiência desktop e fluidez na manipulação dos dados. Ideal para instituições educacionais e projetos científicos que demandam visualização clara de variações climáticas ao longo do tempo. </p> <div align="center">
<div align="center">

#### API para a FATEC:

[Zeus](https://github.com/cesarpelogia/Zeus_Coderhood_FATEC) - Gerenciador de dados climáticos a partir de arquivos <strong>CSV</strong>.

[![ReadMe Card](https://github-readme-stats.vercel.app/api/pin/?username=cesarpelogia&repo=Zeus_Coderhood_FATEC)](https://github.com/cesarpelogia/Zeus_Coderhood_FATEC)

</div>



</div> <h2 align="center">🧰 Tecnologias</h2> <p><strong>Frontend (Desktop):</strong> JavaFX</p> <p><strong>Backend:</strong> Java 17</p> <p><strong>Outros:</strong> Git, GitHub Actions</p> <details> <summary>🛠️ Tecnologias Detalhadas</summary> <strong>Java</strong><br> Utilizado como linguagem principal para lógica e manipulação de dados. <br><br> <strong>JavaFX</strong><br> Framework para criação da interface gráfica desktop. <br><br> <strong>Git e GitHub Actions</strong><br> Controle de versão e automação de deploys e builds. </details> <h2 align="center">🙋‍♂️ Contribuições Pessoais</h2> <details> <summary>📈 Visualização de Dados Boxplot</summary> <p><strong>Objetivo:</strong> Permitir ao usuário importar dados meteorológicos e visualizar estatísticas.</p> <p><strong>Funcionalidades:</strong></p> <li>Importação de arquivos CSV com dados diários.</li> <li>Geração de gráficos boxplot com base nas temperaturas por período.</li> <p><strong>Destaques Técnicos:</strong></p> <li>Leitura e parsing manual de arquivos CSV.</li> <li>Uso de bibliotecas gráficas do JavaFX para plotagem dos dados.</li> </details> <details> <summary>📤 Exportação e Organização</summary> <p><strong>Objetivo:</strong> Garantir que os dados processados pudessem ser reutilizados externamente.</p> <p><strong>Funcionalidades:</strong></p> <li>Exportação dos dados filtrados em CSV.</li> <li>Organização dos dados por mês, ano e estação climática.</li> </details> <h2 align="center">📚 Aprendizados Efetivos</h2> <li>Manipulação de arquivos CSV com Java.</li> <li>Criação de UIs desktop modernas com JavaFX.</li> <li>Aplicação de estatística básica em visualizações gráficas.</li> <li>Melhoria da experiência de usuário em aplicações locais.</li> </div> <br></br>

---

