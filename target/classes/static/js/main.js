//alert('Testando');


//cadastro
  // Seleciona o formulário pela ID
  var formCadastro = document.querySelector('#form-cadastro');

  // Seleciona os campos de senha pela classe
  var senha1 = document.querySelector('.senha1');
  var senha2 = document.querySelector('.senha2');

  // Cria a função de validação para o evento "submit"
  formCadastro.addEventListener('submit', function(event) {
    // Verifica se as senhas são iguais
    if (senha1.value !== senha2.value) {
      // Exibe uma mensagem de erro
      alert("As senhas não correspondem.");
      // Impede o envio do formulário
      event.preventDefault();
    }
  });