# simulador-custo-energia-datacenter

## Descrição do Problema
Um datacenter possui 4 racks de servidores que consomem energia de forma variável. O sistema precisa calcular o custo mensal de energia aplicando um desconto para consumo abaixo de 5000 kWh.

## Requisitos

- Definir o consumo de 4 racks fixo
- Calcular o consumo total
- Aplicar tarifa de R$ 0,85 por kWh
- Aplicar 10% de desconto se o total for menor que 5000 kWh

## Exemplo de Uso

Consumo por rack: [1200, 1500, 1800, 2000] kWh

Saída:

Consumo total: 6500 kWh
Custo mensal: 5525.00 R$

Regras:

- A tarifa base é de 0.85 por kWh
- O desconto só se aplica se o consumo for menor que 5000