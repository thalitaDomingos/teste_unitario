[![Java](https://github.com/thalitaDomingos/teste_unitario/actions/workflows/android.yml/badge.svg)](https://github.com/thalitaDomingos/teste_unitario/actions/workflows/android.yml)

<h1 align="center"> <h1 align="center"> Teste Unitário Utilizando o Android Studio </h1> </h1>

<br/>

## 🛠️ Como baixar o Android Studio:
<p>Acesse o link para realizar o <a href="https://developer.android.com/studio">download do Android Studio</a>. Assim que finalizar o download, faça a instalação.</p>

<br/>

## 🛠️ Como instalar o Android Studio:
<p>Após o arquivo ser baixado, clique em "Next". </p>

![1](https://github.com/thalitaDomingos/teste_unitario/assets/90002483/1a7e08f4-a40b-4740-936b-cf2de9624cd1)

<br/>

<p>Selecione a opção "Custom" para customizar as configurações e os componentes. Logo depois, clique em "Next". Se desejar instalar as configurações padrões, basta selecionar a opção "Stantard".</p>

![2](https://github.com/thalitaDomingos/teste_unitario/assets/90002483/d77c02e6-8aff-4cc7-bde7-2b1082ae1a52)

<br/>

<p>Em seguida, clique em "Next".</p>

![3](https://github.com/thalitaDomingos/teste_unitario/assets/90002483/b763ec4a-880b-474f-a300-159af8f1000b)

<br/>

<p>Selecione a opção "Darcula" se preferir um tema escuro. Caso prefira um tema claro, selecione a opção "Light". Em seguida, clique em "Next".</p>

![4](https://github.com/thalitaDomingos/teste_unitario/assets/90002483/f07973d9-0c37-47e5-80d1-86f6a956cfa8)

<br/>

<p>Marque a opção "Android SDK" para instalar a versão mais recente do SDK. Nesse caso, a versão mais recente é a 33.</p>
<p>Marque a opção "Performance" para fazer com que o emulador execute de forma mais rápida.</p>
<p>Marque a opção "Android Virtual Device" para utilizar um celular virtual. Não é necessário marcar essa opção caso queira usar apenas o próprio celular android. Além disso, é possível fazer essa instalação depois, caso mude de ideia.</p>
<p>Escolha um local para salvar o Android SDK. O diretório escolhido não deve conter caracteres especiais e nem espaços em branco.</p>
<p>Selecione a opção "Next".</p>

![5](https://github.com/thalitaDomingos/teste_unitario/assets/90002483/06f034cc-4932-45d1-81e9-4a54e3d420e0)

<br/>

<p>Aguarde a instalação e quando ela for concluída selecione a opção "Finish".</p>

<br/>

## 🛠️ Como configurar o Software Development Kit - SDK:
<p>Para configurar o SDK, abra a janela "More Actions" e marque a opção "SDK Manager". </p>

<div align="center">

![8](https://github.com/thalitaDomingos/teste_unitario/assets/90002483/702262b2-1f64-4534-bc52-93af403c7e1f)

</div>

<br/>

<p>Em "SDK Platforms" marque as opçoes de API Level que desejar. É recomendado uma versão mais recente e outra menos atual. Marque a opção "OK" para fazer a instalação.</p>

![11](https://github.com/thalitaDomingos/teste_unitario/assets/90002483/968ffc53-2d6e-4e60-92b4-4d6647885161)

<br/>

<p>Aceite os termos e condições e marque a opção "Next". Aguarde a instalação.</p>

![12](https://github.com/thalitaDomingos/teste_unitario/assets/90002483/47fd5554-79d0-44a7-990f-de07af936c26)

<br/>

<p>Abra novamente a janela "More Actions" e "SDK Manager" para configurar o SDK Tools. Marque as opções que estão selecionadas na imagem abaixo e clique em "OK".</p>

![14](https://github.com/thalitaDomingos/teste_unitario/assets/90002483/bc872343-2f5f-4a09-8149-ffc33807eb4e)

<br/>

<p>Aguarde a instalação e clique em "Finish".</p>

## 🛠️ Passos para criar um projeto no Android Studio:
<p>Selecione a opção "New Project".</p>

<div align="center">

![1](https://github.com/thalitaDomingos/teste_unitario/assets/90002483/b78d812a-a062-47db-8737-ef12f575a48a)

</div>

<br/>

<p>Selecione a tela que desejar. Geralmente, iniciamos com a tela "Empty Activity", uma tela simples que mostra apenas a mensagem "Hello World".</p>

![2](https://github.com/thalitaDomingos/teste_unitario/assets/90002483/1d316a65-54a6-4c01-b4e7-6e42f31e45c5)

<br/>

<p>Escolha um nome para o projeto e para o pacote do projeto. Escolha também um local para ele ser salvo. Em seguida, marque a linguagem que será usada (Java ou Kotlin). Selecione a opção "Finish". </p>

![3](https://github.com/thalitaDomingos/teste_unitario/assets/90002483/fe55857a-4f82-47d2-bbbb-353592e5c203)

<br/>

<p>O Android Studio criará um projeto "pronto". Para rodá-lo é necessário clicar no seguinte botão: </p>

![studio-editor](https://github.com/thalitaDomingos/teste_unitario/assets/90002483/82c31832-2f14-4b83-9da3-14276b021eba)

<br/>

<p>Em seguida, a mensagem "Hello World" será mostrada no emulador Android ou no dispositivo Android. Lembre-se de ativar o modo desenvolvedor do seu celular, caso use ele para rodar os aplicativos.</p>

<br/>

<p>Para rodar o código pelo terminal do Android Studio, execute o seguinte comando:</p>

```
cd /Users/seu-usuario/AndroidStudioProjects/NomeDoProjeto
```

<br/>

<p>Execute o comando abaixo para compilar e instalar o aplicativo no dispositivo ou emulador:</p>

```
./gradlew installDebug
```
<br/>

<p>Após a instalação, o aplicativo pode ser iniciado utilizando o seguinte comando:</p>

```
adb shell am start -n com.seuapp.nomepacote/.NomeDaAtividadePrincipal
```

<br/>

## 🛠️ Gerenciamento de dependências do Android Studio:
<p>É possível gerenciar as dependências do Android Studio através do arquivo build.gradle do módulo. Esse arquivo, normalmente localizado no diretório do módulo do projeto, contém uma seção chamada dependencies. Nessa seção, pode-se adicionar as dependências do projeto, ou seja, pode-se adicionar bibliotecas locais ou bibliotecas hospedadas em repositórios remotos, como o Maven Central ou o JCenter. Além disso, o arquivo build.gradle do módulo trabalha com as linguagens groovy e kotlin. Por exemplo, para adicionar a biblioteca Gson em groovy, basta adicionar a seguinte linha no arquivo build.gradle do módulo:</p>

``` 
dependencies {
   implementation 'com.google.code.gson:gson:2.8.8'
}
```

<br/>

## 🛠️ Como instalar o código "calculator_test":

<br/>

![1](https://github.com/thalitaDomingos/teste_unitario/assets/90002483/c2d806df-c475-4897-9b6c-7b81bb350153)

<br/>

<p>Para instalar o código é necessário clicar no botão "code". Em seguida, o código pode ser clonado ou baixado em formato ZIP. Para clonar, é preciso copiar o link do repositório. Em seguida, abra o git bash para clonar o repositório. Caso não tenha esse programa, baixe no <a href="https://git-scm.com/">site do Git</a>. Com o terminal do git bash aberto digite o comando abaixo:</p>
  
```
  git clone https://github.com/thalitaDomingos/teste_unitario.git
```

<p>O comando para colar um texto no terminal do git bash é "Shift + Insert".</p>

<br/>

## 🛠️ Como executar o código "calculator_test":
<p>Após clonar ou baixar o arquivo, abra o projeto no Android Studio.</p>
  
<br/>

![1](https://github.com/thalitaDomingos/teste_unitario/assets/90002483/6548fca3-84c7-4dfe-9651-ff0dac72b0b7)

<br/>

<p>Para executar os testes, abra o arquivo "CalculatorTest". Os testes podem ser testados todos juntos ou um por um. Para testar todos juntos, basta apertar o botão da classe "CalculatorTest, que se encontra na linha 6 do código. Já para testar um por um, é necessário localizar o teste que deseja como, por exemplo, o "testeAdd" que está localizado na linha 11, e pressionar o botão ao lado dele.</p>

<br/>

<p>Para gerar o relatório de testes, digite o comando abaixo no terminal do Android Studio:</p>

 ```
 ./gradlew clean test
 ```
 
 <br/>

<p>Para gerar o pacote APK, digite o comando abaixo no terminal do Android Studio:</p>

 ```
./gradlew assembleDebug
 ```
 
 
