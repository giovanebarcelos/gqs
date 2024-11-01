**Código da Página ">SistemaBanco" do Fitnesse**

```
!define TEST_SYSTEM {slim}
!define COLLAPSE_SETUP {true}
!define COLLAPSE_TEARDOWN {true}

# Caminho onde estão armazenadas as classes compiladas
!path /Users/giovane.barcelos/Documents/gqs/target/classes

# Imports dos caminhos das classes nos pacotes
|import |
|br.gqs.fitnesse|

!1 Teste de Aceitação do Sistema Bancário

!3 RF1) Criar Conta com Saldo Inicial

Esta funcionalidade deve criar um saldo inicial e verificar se este saldo esta correto na conta do cliente.

!| script: ContaBanco |
| criarConta; | "12345" | 1000.0 |
| check | mostrarSaldoDaConta | "12345" | 1000.0 |

!3 RF2) Depositar Dinheiro na Conta

!| script: ContaBanco |
| criarConta; | "12345" | 1000.0 |
| depositar; |  "12345" | 100.0 |
| check | mostrarSaldoDaConta | "12345" | 1100.0 |

!3 RF3) Sacar Dinheiro da Conta

!3 RF4) Transferir Dinheiro entre Contas

!3 RF5) Verificar Saldo Insuficiente para Saque

!3 RF6) Conta Inexistente

!3 RF7) Fechar Conta

!3 RF8) Saldo Zero após Saque

!3 RF9) Verificar Histórico de Transações

!3 RF10) Transferência Falha por Saldo Insuficiente
```