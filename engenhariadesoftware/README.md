# Atividade 1

Withain Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software : engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomesnsion to programming. Cubes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, mmimaintenance). The addition of time adds an important new dimeension to programming.


We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.




- É a integração do processo de programação ao longo do tempo. É a modo de como novos softwares são criados, desenvolvidos, modificados e mantidos. Engenharia de software envolve não é só a programação em si, mas também a consideração do tempo, escala e dos trade-offs envolvidos no desenvolvimento. Os engenheiros de software precisam se preocupar com a passagem do tempo, a necessidade de mudanças, a eficiência do software e da organização que o produz, e tomar decisões complexas com consequências de alto risco, muitas vezes baseadas em estimativas imprecisas.



# Atividade 2 

- 1 Escolher entre gastar dinheiro em um jantar chique ou economizar para uma viagem futura.
- 2 Decidir entre ficar em casa estudando para uma prova importante ou sair com os amigos para se divertir.
- 3 Optar por trabalhar horas extras para receber um aumento no salário ou passar mais tempo com a família e amigos.



# Atividade 3 👍

https://docs.google.com/presentation/d/1Lmad2CS1pM1UycQpYn6FiDm2NsEO6CVSchym65tuk4U/edit#slide=id.g1f2b4e971a0_0_139

## Slides da atividade :+1:

**24 Pequenos web sites:**
 Eu sugeri pequenos web sites, pois como ele tem uma alta simplicidade, e a tolerância falha é baixa, acaba por sugerir que não é algo que tenha usuários frequentes, assim resultando num banco de dados pouco estruturado.

 - Simplicity:⭐⭐⭐⭐⭐
 - Fault tolerance:⭐
 
**25 Segurança de dados:**
 Por sua estrutura simples, revela-se que a cada clique as informações do usuário irão ficar protegidas e criptografas.

 - Overall cost:⭐⭐⭐⭐⭐
 - Fault tolerance:⭐

 **26 Sistema operacional:**
 Estrutura microcare para sistema operacional.
 
 - Overall cost:⭐⭐⭐⭐⭐
 - Scability:⭐

**27 Software de serviço:**
Estrutura para software de serviço não especificado.
  
 - Reliability:⭐⭐⭐⭐
 - Elasticity:⭐⭐

**28 Pix:**
Estrutura para pix, ou outros softwares de serviços monetários.

 - Scalability:⭐⭐⭐⭐⭐
 - Simplicity:⭐

 
**29 Serviço Nuvem:**
 Tem uma escabilidade alta, podendo ser possível vários usuários manusear, entretanto com sua simplicidade alta deixa isso difícil. 

 - Scalability:⭐⭐⭐⭐⭐
 - Simplicity:⭐



# Atividade 4

**Loja de livros**

 - Simplicity:⭐⭐⭐⭐⭐
 - Overall cost:⭐⭐⭐⭐⭐
 - Performace:⭐
 - Scability:⭐




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CompraDelivros { 
   private List<String> produtos; private Map<String, Integer> carrinho;
}

public CompraDelivros() {
    this.produtos = new ArrayList<>();
    this.produtos.add("O Pequeno Príncipe");
    this.produtos.add("Dom Quixote");
    this.produtos.add("A arte da guerra");
    this.produtos.add("Cem Anos de Solidão");
    
    this.carrinho = new HashMap<>();
}

public class CompraDelivros {

    public static void main(String[] args) {
        List<String> produtos = new ArrayList<>();
        produtos.add("O Pequeno Príncipe");
        produtos.add("Dom Quixote");
        produtos.add("A arte da guerra");
        produtos.add("Cem Anos de Solidão");

        Map<String, Integer> carrinho = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lista de produtos disponíveis:");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println((i + 1) + ". " + produtos.get(i));
        }

        String continuar = "S";
        while (continuar.equalsIgnoreCase("S")) {
            System.out.print("Selecione o número do produto que deseja adicionar ao carrinho: ");
            int escolha = scanner.nextInt();

            if (escolha >= 1 && escolha <= produtos.size()) {
                String produtoSelecionado = produtos.get(escolha - 1);
                if (carrinho.containsKey(produtoSelecionado)) {
                    carrinho.put(produtoSelecionado, carrinho.get(produtoSelecionado) + 1);
                } else {
                    carrinho.put(produtoSelecionado, 1);
                }
            } else {
                System.out.println("Opção inválida.");
            }

            System.out.print("Deseja continuar comprando? (S/N) ");
            continuar = scanner.next();
        }

        System.out.println("Livros selecionados:");
        double total = 0;
        for (String produto : carrinho.keySet()) {
            int quantidade = carrinho.get(produto);
            double precoUnitario = 10.0; // Preço unitário fictício
            double precoTotal = quantidade * precoUnitario;
            total += precoTotal;
            System.out.println(produto + " - Quantidade: " + quantidade + " - Preço Total: R$" + precoTotal);
        }

        System.out.println("Total da compra: R$" + total);

        scanner.close();
    }
}
//requer maior reivsão e detalhamento

