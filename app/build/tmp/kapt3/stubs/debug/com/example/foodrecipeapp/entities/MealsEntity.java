package com.example.foodrecipeapp.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u0096\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010\'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020\u0003\u00a2\u0006\u0002\u00104J\t\u0010g\u001a\u00020\u0003H\u00c6\u0003J\t\u0010h\u001a\u00020\u0003H\u00c6\u0003J\t\u0010i\u001a\u00020\u0003H\u00c6\u0003J\t\u0010j\u001a\u00020\u0003H\u00c6\u0003J\t\u0010k\u001a\u00020\u0003H\u00c6\u0003J\t\u0010l\u001a\u00020\u0003H\u00c6\u0003J\t\u0010m\u001a\u00020\u0003H\u00c6\u0003J\t\u0010n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010o\u001a\u00020\u0003H\u00c6\u0003J\t\u0010p\u001a\u00020\u0003H\u00c6\u0003J\t\u0010q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010s\u001a\u00020\u0003H\u00c6\u0003J\t\u0010t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010u\u001a\u00020\u0003H\u00c6\u0003J\t\u0010v\u001a\u00020\u0003H\u00c6\u0003J\t\u0010w\u001a\u00020\u0003H\u00c6\u0003J\t\u0010x\u001a\u00020\u0003H\u00c6\u0003J\t\u0010y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010{\u001a\u00020\u0003H\u00c6\u0003J\t\u0010|\u001a\u00020\u0003H\u00c6\u0003J\t\u0010}\u001a\u00020\u0003H\u00c6\u0003J\t\u0010~\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0003H\u00c6\u0003J\u00f4\u0003\u0010\u0098\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u0003H\u00c6\u0001J\u0016\u0010\u0099\u0001\u001a\u00030\u009a\u00012\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u000b\u0010\u009c\u0001\u001a\u00030\u009d\u0001H\u00d6\u0001J\n\u0010\u009e\u0001\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00106R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00106R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00106R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00106R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00106R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00106R\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00106R\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00106R\u0016\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00106R\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00106R\u0016\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00106R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00106R\u0016\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00106R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00106R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00106R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00106R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00106R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00106R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00106R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00106R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00106R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00106R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00106R\u0016\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u00106R\u0016\u0010(\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u00106R\u0016\u0010)\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00106R\u0016\u0010*\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00106R\u0016\u0010+\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u00106R\u0016\u0010,\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00106R\u0016\u0010-\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00106R\u0016\u0010.\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u00106R\u0016\u0010/\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00106R\u0016\u00100\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u00106R\u0016\u00101\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u00106R\u0016\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u00106R\u0016\u00102\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u00106R\u0016\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u00106R\u0016\u0010\"\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u00106R\u0016\u0010#\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u00106R\u0016\u0010$\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u00106R\u0016\u0010%\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u00106R\u0016\u0010&\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u00106R\u0016\u0010\'\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u00106R\u0016\u00103\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u00106R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\be\u00106R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u00106\u00a8\u0006\u009f\u0001"}, d2 = {"Lcom/example/foodrecipeapp/entities/MealsEntity;", "", "idmeal", "", "strmeal", "strcategory", "strarea", "strinstructions", "strmealthumb", "strtags", "stryoutube", "stringredient1", "stringredient2", "stringredient3", "stringredient4", "stringredient5", "stringredient6", "stringredient7", "stringredient8", "stringredient9", "stringredient10", "stringredient11", "stringredient12", "stringredient13", "stringredient14", "stringredient15", "stringredient16", "stringredient17", "stringredient18", "stringredient19", "stringredient20", "strmeasure1", "strmeasure2", "strmeasure3", "strmeasure4", "strmeasure5", "strmeasure6", "strmeasure7", "strmeasure8", "strmeasure9", "strmeasure10", "strmeasure11", "strmeasure12", "strmeasure13", "strmeasure14", "strmeasure15", "strmeasure16", "strmeasure17", "strmeasure18", "strmeasure19", "strmeasure20", "strsource", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdmeal", "()Ljava/lang/String;", "getStrarea", "getStrcategory", "getStringredient1", "getStringredient10", "getStringredient11", "getStringredient12", "getStringredient13", "getStringredient14", "getStringredient15", "getStringredient16", "getStringredient17", "getStringredient18", "getStringredient19", "getStringredient2", "getStringredient20", "getStringredient3", "getStringredient4", "getStringredient5", "getStringredient6", "getStringredient7", "getStringredient8", "getStringredient9", "getStrinstructions", "getStrmeal", "getStrmealthumb", "getStrmeasure1", "getStrmeasure10", "getStrmeasure11", "getStrmeasure12", "getStrmeasure13", "getStrmeasure14", "getStrmeasure15", "getStrmeasure16", "getStrmeasure17", "getStrmeasure18", "getStrmeasure19", "getStrmeasure2", "getStrmeasure20", "getStrmeasure3", "getStrmeasure4", "getStrmeasure5", "getStrmeasure6", "getStrmeasure7", "getStrmeasure8", "getStrmeasure9", "getStrsource", "getStrtags", "getStryoutube", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class MealsEntity {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "idMeal")
    @com.google.gson.annotations.Expose()
    private final java.lang.String idmeal = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeal")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeal = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strCategory")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strcategory = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strArea")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strarea = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strInstructions")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strinstructions = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMealThumb")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmealthumb = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strTags")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strtags = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strYoutube")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stryoutube = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient1")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient1 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient2")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient2 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient3")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient3 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient4")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient4 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient5")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient5 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient6")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient6 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient7")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient7 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient8")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient8 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient9")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient9 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient10")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient10 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient11")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient11 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient12")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient12 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient13")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient13 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient14")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient14 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient15")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient15 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient16")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient16 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient17")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient17 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient18")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient18 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient19")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient19 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strIngredient20")
    @com.google.gson.annotations.Expose()
    private final java.lang.String stringredient20 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure1")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure1 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure2")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure2 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure3")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure3 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure4")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure4 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure5")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure5 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure6")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure6 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure7")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure7 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure8")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure8 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure9")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure9 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure10")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure10 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure11")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure11 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure12")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure12 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure13")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure13 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure14")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure14 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure15")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure15 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure16")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure16 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure17")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure17 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure18")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure18 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure19")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure19 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strMeasure20")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strmeasure20 = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "strSource")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strsource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.foodrecipeapp.entities.MealsEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String idmeal, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeal, @org.jetbrains.annotations.NotNull()
    java.lang.String strcategory, @org.jetbrains.annotations.NotNull()
    java.lang.String strarea, @org.jetbrains.annotations.NotNull()
    java.lang.String strinstructions, @org.jetbrains.annotations.NotNull()
    java.lang.String strmealthumb, @org.jetbrains.annotations.NotNull()
    java.lang.String strtags, @org.jetbrains.annotations.NotNull()
    java.lang.String stryoutube, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient1, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient2, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient3, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient4, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient5, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient6, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient7, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient8, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient9, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient10, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient11, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient12, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient13, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient14, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient15, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient16, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient17, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient18, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient19, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient20, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure1, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure2, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure3, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure4, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure5, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure6, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure7, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure8, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure9, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure10, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure11, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure12, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure13, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure14, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure15, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure16, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure17, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure18, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure19, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure20, @org.jetbrains.annotations.NotNull()
    java.lang.String strsource) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MealsEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String idmeal, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeal, @org.jetbrains.annotations.NotNull()
    java.lang.String strcategory, @org.jetbrains.annotations.NotNull()
    java.lang.String strarea, @org.jetbrains.annotations.NotNull()
    java.lang.String strinstructions, @org.jetbrains.annotations.NotNull()
    java.lang.String strmealthumb, @org.jetbrains.annotations.NotNull()
    java.lang.String strtags, @org.jetbrains.annotations.NotNull()
    java.lang.String stryoutube, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient1, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient2, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient3, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient4, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient5, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient6, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient7, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient8, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient9, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient10, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient11, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient12, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient13, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient14, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient15, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient16, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient17, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient18, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient19, @org.jetbrains.annotations.NotNull()
    java.lang.String stringredient20, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure1, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure2, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure3, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure4, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure5, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure6, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure7, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure8, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure9, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure10, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure11, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure12, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure13, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure14, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure15, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure16, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure17, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure18, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure19, @org.jetbrains.annotations.NotNull()
    java.lang.String strmeasure20, @org.jetbrains.annotations.NotNull()
    java.lang.String strsource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdmeal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrcategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrarea() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrinstructions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmealthumb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrtags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStryoutube() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringredient20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component39() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component41() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component42() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component43() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component44() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component45() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component46() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component47() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component48() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrmeasure20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component49() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrsource() {
        return null;
    }
}