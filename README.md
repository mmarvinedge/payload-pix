# payload-pix

Implementação básica de geração de payload PIX com valor dinamico.

# Start
Na implementação da classe payload é necessário popular alguns dados para a geração do payload e posteriormente o QRCode

PixKey - Chave PIX, seja ela CNPJ/CPF, telefone, email ou chave aleatória.
MarchantName - Nome do recebedor
MerchantCity - Cidade do recebedor
Amout - Valor do recebimento
Txid - Código aleatório de identificação

Após popular os dados o método getPayload retorná o payload que posteriormente pode ser gerado o QRCode utilizando a classe QRCodeGenerator
