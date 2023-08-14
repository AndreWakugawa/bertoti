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

Por que dois softwares que oferecem os mesmos recursos e experiências possuem uma diferença enorme de usuários?

Exemplo: Steam e EGS(Epic Games Store) <Usabilidade>

Ambos são 'marketplaces' de jogos e softwares digitais, disponibilizam valores em Real(R$) e oferecem promoções periodicamente.

Na plataforma Steam há uma ótima experiência de usuário estabelecida faz décadas com botões posicionados onde se espera. Há tambem uma identidade visual facilmente reconhecível além de promoções de estação (Outono, primavera, inverno e verão).

A plataforma EGS oferece um jogo grátis para resgate toda semana, possui as promoções de estação e o uso de Cupons de Desconto para se diferenciar da Steam. Contudo, a experiência do usuário é consideravelmente inferior. O sistema ao todo é mais lento mesmo consumindo mais recursos da máquina do usuári. Além disso, os botões são difíceis de encontrar e os filtros (jogos já instalados, ordenação alfabética) não funcionam como deveriam.