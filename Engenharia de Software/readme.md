Atividades 1 e 2

We see three critical differences between programming and software engineering:
time, scale, and the trade-offs at play.
On a software engineering project,
engineers need to be more concerned with the passage of time and the eventual need for change.
In a software engineering organization,
we need to be more concerned about scale and efficiency,
both for the software we produce as well as for the organization that is producing it.
Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes,
often based on imprecise estimates of time and growth.

-  No contexto de projeto, o ES deve priorizar o tempo e a possibilidade de mudanças.
-  No contexto de uma organização, o ES deve priorizar escalabilidade e eficiência.
-  É responsabilidade do Engenheiro de Software realizar decisões de grande risco que, frequentemente, tem em falta as informações de tempo e crescimento necessárias.


Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

- Para o Google a Engenharia de Software é a Programação com a passagem de tempo.
- Exemplos dados de dimensão (Manutenção e Modificação do Software já desenvolvido)

3 exemplos de trade-offs:
- Uso de Python: maior facilidade de programação por ser mais "entendível" em relação à outras linguagens. Porém em troca, há uma considerável diminuição na velocidade no código. Usabilidade por Eficiência.

- Adição de criptografia: propõe maior segurança para os dados do sistema mas requer tempo e manutenção constante para se manter útil, o que pode depreciar o software em relação à velocidade do sistema e experiência de usuário (necessidade de login a cada nova sessão, uso de 2FA, etc.)
Segurança x Usabilidade

- Uso de github: possibilidade de versionamento, maior organização e segurança que propõe um ambiente melhor para o desenvolvimento em maior número. Em troca há uma grande dificuldade e tempo de aprendizado.
Escalabilidade x Usabilidade/Acessibilidade


-----------------------------------

Atividade 3

Por que dois softwares que oferecem os mesmos recursos e experiências possuem uma diferença enorme de usuários?

Exemplo: Steam e EGS(Epic Games Store) <Usabilidade>

Ambos são 'marketplaces' de jogos e softwares digitais, disponibilizam valores em Real(R$) e oferecem promoções periodicamente.

Na plataforma Steam há uma ótima experiência de usuário estabelecida faz décadas com botões posicionados onde se espera. Há tambem uma identidade visual facilmente reconhecível além de promoções de estação (Outono, primavera, inverno e verão).

A plataforma EGS oferece um jogo grátis para resgate toda semana, possui as promoções de estação e o uso de Cupons de Desconto para se diferenciar da Steam. Contudo, a experiência do usuário é consideravelmente inferior. O sistema ao todo é mais lento mesmo consumindo mais recursos da máquina do usuári. Além disso, os botões são difíceis de encontrar e os filtros (jogos já instalados, ordenação alfabética) não funcionam como deveriam.

---------------------------------------

Atividade 4

https://www.nngroup.com/articles/ten-usability-heuristics/

Perguntas: 
 - sobre qual requisito não funcional este texto fala?
   O texto fala sobre a usabilidade.
 - qual a importância?
   user experience (ux), facilidade de utilizar um software
 - como "obter" esse recurso nao-funcional?
   aplicando as 10 heurísticas do texto.
 - encontre 1 erro e 1 acerto de cada heuristica e coloque no seu readme do git
   1. Visibilidade do status de sistema.
     - Acerto: ecommerce que indica se algum item está indisponível deixando o botão de selecionar desabilitado 
     - Erro: Browser que não indica se uma página está abrindo após clicar em um link (sem barra de progresso)
   2. Correspondência entre sistema e o mundo real.
     - Acerto: Controle de volume do celular (botão de cima aumenta, botão de baixo diminui)
     - Erro: SOS de emergência no celular (apertar botão de ligar 5 vezes seguidas) não é associado a algo parecido do mundo real
   3. Controle pelo usuário e Liberdade.
     - Acerto: Redes sociais que permitem facilmente o usuário a deletar a conta quando quiserem.
     - Erro: Sites de notícias que permitem que você leia somente o primeiro parágrafo antes de oferecer um plano de assinatura para continuar a leitura.
   4. Consistência e padrões.
     - Acerto: Botão "confirmar" ou "continuar" em cor verde
     - Erro: Botão "voltar" ou "cancelar" em cor verde
   5. Prevenção de erros.
     - Acerto: "autofill" em barras de pesquisa
     - Erro: Cadastros que requerem que o usuário formate o telefone com simbolos "()-"
   6. Reconhecimento ao invés de relembrar.
     - Acerto: Browsers que mantém o histórico do usuário.
     - Erro: Redes sociais que não mantém o usuário logado após a saída.
   7. Flexibilidade e eficiência de uso.
     - Acerto: Email que permite o envio do mesmo email para várias pessoas (BCC)
     - Erro: aplicativos que não permitem customização.
   8. Estética e design minimalístico.
     - Acerto: Landing page do google hoje em dia.
     - Erro: Websites na década de 90
   9. Ajudar usuários a reconhecer, diagnosticar e recuperar de erros.
     - Acerto: Instagram com mensagem de "Tem certeza que deseja voltar?" quando o usuário volta após tirar uma foto
     - Erro: Quando usuário preenche um URL com formatação errada e a mensagem "Entre com URL válido" aparece
   10. Ajuda e documentação.
     - Acerto: Trello com templates que ajudam novos usuários.
     - Erro: Página de suporte ao cliente sem barra de pesquisa.
