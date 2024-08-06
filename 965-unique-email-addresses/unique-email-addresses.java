class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for(String email : emails){
            String[] parts = email.split("@");
            if (parts.length != 2) continue;
            String local = parts[0];
            String domain = parts[1];
            local = local.split("\\+")[0].replace(".","");
            String cleanEmail= local+"@"+domain;
            uniqueEmails.add(cleanEmail);
        }
        return uniqueEmails.size();
        
    }
}