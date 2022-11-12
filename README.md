# 256 Tons de cinza

Software de conversão de imagem simplificado.

## Descrição

### Contexto

256 Tons de cinza é um software focado na remoção de canais RGB da imagem para assim transformá-la em escala de cinza.

Além disto, este software também calcula a tonalidade dos pixels da imagem para convertê-la em branco e preto. Neste cenário, os pixels que na escala de cinza forem `< 127` tornar-se-ão **brancos** e `>= 128` tornar-se-ão pretos na imagem.

### Informações essenciais

- Idioma: Português.

- Linguagem: Java.

- Contêm interface gráfica.

- Funciona em ambientes: Linux, MacOS e Windows.

## Funcionalidades

- Importar a imagem do computador.

- Limpar imagem (escolher outra imagem para editar).

- Converter imagem para escala de cinza.

- Converter imagem para branco e preto.

- Exportar imagem.

- Visualizar imagem original em miniatura durante a edição.

- Escolher o nome do arquivo da imagem convertida.

## Instalação

Este software é portátil, ou seja, não há necessidade de instalação e já está pronto para ser executado!

### Dependências

1. Java

### Execução

1. Baixe o arquivo executavél `.jar` na seção `release`.

1. Abra o `terminal` e execute o comando:
    > $ `java -jar ./256_tons_de_cinza.jar`

1. Ou clone o este repositório e execute:
    > $ `java -jar ./dist/256_tons_de_cinza.jar`

1. Aproveite!

## Screenshoots

### Interface do software

- ![Software menu file chooser](./docs/screenshots/01_menu_file_chooser.png)

- ![Software main screen clean content](./docs/screenshots/02_screen_main_clean.png)

- ![Software main screen loaded content](./docs/screenshots/03_screen_main_loaded.png)

- ![Software main screen grey scale](./docs/screenshots/04_screen_main_grey.png)

- ![Software main screen white black scale](./docs/screenshots/05_screen_main_white.png)

- ![Software menu file export](./docs/screenshots/06_menu_file_export.png)

### Resultado da exportação

- ![Export gray scale](./dist/beach_scale_grey.jpg)

- ![Export white black scale](./dist/beach_scale_white.jpg)