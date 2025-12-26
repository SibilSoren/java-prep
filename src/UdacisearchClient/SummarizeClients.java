package UdacisearchClient;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public final class SummarizeClients {

    public static void main(String[] args) {

        int numClients = 0;
        int totalQuarterlySpend = 0;
        UdacisearchClient nextExpiration = null;
        Set<ZoneId> representedZoneIds = new HashSet<>();
        Map<Year, Integer> contractsPerYear = new HashMap<>();

        // for (UdacisearchClient client : ClientStore.getClients()) {
        // numClients++;

        // if (nextExpiration == null ||
        // client.getContractStart().plus(client.getContractLength())
        // .isBefore(nextExpiration.getContractStart().plus(nextExpiration.getContractLength())))
        // {
        // nextExpiration = client;
        // }
        // for (ZoneId zone : client.getTimeZones()) {
        // representedZoneIds.add(zone);
        // }
        // contractsPerYear.compute(getContractYear(client), (k, v) -> (v == null) ? 1 :
        // v + 1);
        // }
        List<UdacisearchClient> clients = ClientStore.getClients();

        totalQuarterlySpend = clients.stream().filter(Objects::nonNull).mapToInt(UdacisearchClient::getQuarterlyBudget)
                .sum();
        Double averageBudget = clients.stream().filter(Objects::nonNull)
                .mapToDouble(UdacisearchClient::getQuarterlyBudget)
                .average().orElse(0);

        long nextExpirationId = clients.stream()
                .min(Comparator.comparing(UdacisearchClient::getContractEnd))
                .map(UdacisearchClient::getId)
                .orElse(-1L);

        representedZoneIds = clients.stream()
                .filter(Objects::nonNull).flatMap(client -> client.getTimeZones().stream()).collect(Collectors.toSet());

        contractsPerYear = clients.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(
                        SummarizeClients::getContractYear,
                        Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));

        System.out.println("Num clients: " + numClients);
        System.out.println("Total quarterly spend: " + totalQuarterlySpend);
        System.out.println("Average budget: " + averageBudget);
        System.out.println("ID of next expiring contract: " + nextExpirationId);
        System.out.println("Client time zones: " + representedZoneIds);
        System.out.println("Contracts per year: " + contractsPerYear);
    }

    private static Year getContractYear(UdacisearchClient client) {
        LocalDate contractDate = LocalDate.ofInstant(client.getContractStart(), client.getTimeZones().get(0));
        return Year.of(contractDate.getYear());
    }
}
