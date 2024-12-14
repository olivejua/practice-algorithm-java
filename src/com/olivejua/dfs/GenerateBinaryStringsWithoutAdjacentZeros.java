package com.olivejua.dfs;

import org.assertj.core.internal.bytebuddy.implementation.bytecode.assign.TypeCasting;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStringsWithoutAdjacentZeros {

    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();

        dfs("", n, result);

        return result;
    }

    private void dfs(String currentString, int length, List<String> result) {
        if (currentString.length() == length) {
            result.add(currentString);
            return;
        }

        if (currentString.isEmpty() || currentString.charAt(currentString.length()-1) == '1') {
            dfs(currentString + '0', length, result);
        }

        dfs(currentString + '1', length, result);
    }
}
