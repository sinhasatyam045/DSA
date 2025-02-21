package  dsasheet_Strings;

public class WildStringMatch {
    public static boolean doesMatch(String wild, String pattern) {

        for (int i = 0; i < wild.length(); i++) {
            char curr = wild.charAt(i);
            if (curr == pattern.charAt(i)) {
                continue;
            } else if (curr == '?') {
                if (wild.charAt(i + 1) == pattern.charAt(i + 1)) {
                    continue;
                }
                return false;

            } else if (curr == '*') {
                String temp = pattern.substring(i + 1);
                for (int j = 0; j < temp.length(); j++) {
                    if (temp.charAt(j) != '?' || temp.charAt(j) != '*') {
                        continue;
                    } else {
                        return false;
                    }
                }

            }

        }
        return true;

    }

    public static void main(String args[]) {
        String wild = "ge?ks*";
        String pattern = "geeksforgeeks";
        if ((doesMatch(pattern, pattern))) {

            System.out.println("Matches");
        }

        else {
            System.out.println("Does not matches");
        }

    }

}


//*
class Main {
	public static boolean isMatch(String s, String p) {
		//dry run this sample case on paper , if unable to understand what soln does
		// p = "a*bc" s = "abcbc"
	int sIdx = 0, pIdx = 0, lastWildcardIdx = -1, sBacktrackIdx = -1, nextToWildcardIdx = -1;
		while (sIdx < s.length()) {
			if (pIdx < p.length() && (p.charAt(pIdx) == '?' || p.charAt(pIdx) == s.charAt(sIdx))) {
							// chars match

			++sIdx;
				++pIdx;
			} else if (pIdx < p.length() && p.charAt(pIdx) == '*') {
								// wildcard, so chars match - store index.

			lastWildcardIdx = pIdx;
				nextToWildcardIdx = ++pIdx;
				sBacktrackIdx = sIdx;
							//storing the pidx+1 as from there I want to match the remaining pattern

			} else if (lastWildcardIdx == -1) {
							// no match, and no wildcard has been found.

			return false;
			} else {
							// backtrack - no match, but a previous wildcard was found.

			pIdx = nextToWildcardIdx;
				sIdx = ++sBacktrackIdx;
			//backtrack string from previousbacktrackidx + 1 index to see if then new pidx and sidx have same chars, if that is the case that means wildcard can absorb the chars in b/w and still further we can run the algo, if at later stage it fails we can backtrack
			}
		}
		for(int i = pIdx; i < p.length(); i++) {
			if(p.charAt(i) != '*') {
				return false;
			}
		}
		return true;
			// true if every remaining char in p is wildcard

	}

	public static void main(String[] args) {
		String str = "baaabab";
		String pattern = "*****ba*****ab";

		if (isMatch(str, pattern)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

 *//