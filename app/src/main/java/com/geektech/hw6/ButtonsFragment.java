package com.geektech.hw6;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonsFragment extends Fragment {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
            btnDivide, btnMultiply, btnMinus, btnPlus, btnPercent, btnEqual, btnDot, btnClear;

    private Double firstValues, secondValues, result_operation;
    private String operation;
    private IShowText result;
    private String s = "";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        result = (IShowText) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buttons, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initialization(view);
        setOnClickListeners();
        onNumberClick(view);
        onOperationClick(view);
    }

    private void initialization(View view) {
        btn0 = view.findViewById(R.id.zero);
        btn1 = view.findViewById(R.id.one);
        btn2 = view.findViewById(R.id.two);
        btn3 = view.findViewById(R.id.three);
        btn4 = view.findViewById(R.id.four);
        btn5 = view.findViewById(R.id.five);
        btn6 = view.findViewById(R.id.six);
        btn7 = view.findViewById(R.id.seven);
        btn8 = view.findViewById(R.id.eight);
        btn9 = view.findViewById(R.id.nine);
        btnPlus = view.findViewById(R.id.plus);
        btnMinus = view.findViewById(R.id.minus);
        btnMultiply = view.findViewById(R.id.multiply);
        btnDivide = view.findViewById(R.id.divide);
        btnPercent = view.findViewById(R.id.percent);
        btnEqual = view.findViewById(R.id.equal);
        btnDot = view.findViewById(R.id.dot);
        btnClear = view.findViewById(R.id.clear);
    }

    private void setOnClickListeners() {
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperationClick(v);
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperationClick(v);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperationClick(v);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperationClick(v);
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperationClick(v);
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperationClick(v);
            }
        });
    }

    private void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.clear:
                result.showText("");
                s = "";
                firstValues = 0.0;
                secondValues = 0.0;
                break;
            case R.id.one:
                s += "1";
                break;
            case R.id.two:
                s += "2";
                break;
            case R.id.three:
                s += "3";
                break;
            case R.id.four:
                s += "4";
                break;
            case R.id.five:
                s += "5";
                break;
            case R.id.six:
                s += "6";
                break;
            case R.id.seven:
                s += "7";
                break;
            case R.id.eight:
                s += "8";
                break;
            case R.id.nine:
                s += "9";
                break;
            case R.id.zero:
                s += "0";
                break;
            case R.id.dot:
                s += ".";
                break;
        }
        result.showText(s);
    }

    private void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.plus:
                firstValues = Double.valueOf(s);
                result.showText(firstValues + "+");
                operation = "+";
                s = "";
                break;
            case R.id.minus:
                firstValues = Double.valueOf(s);
                result.showText(firstValues + "-");
                operation = "-";
                s = "";
                break;
            case R.id.multiply:
                firstValues = Double.valueOf(s);
                result.showText(firstValues + "*");
                operation = "*";
                s = "";
                break;
            case R.id.divide:
                firstValues = Double.valueOf(s);
                result.showText(firstValues + "/");
                operation = "/";
                s = "";
                break;
            case R.id.equal:
                if (operation != null) {
                    secondValues = Double.valueOf(s);
                    switch (operation) {
                        case "+":
                            plusOperation();
                            break;
                        case "-":
                            minusOperation();
                            break;
                        case "*":
                            multiplyOperation();
                            break;
                        case "/":
                            if (firstValues > 0) {
                                try {
                                    divideOperation();
                                } catch (ArithmeticException AE) {
                                    result.showText("");
                                }
                            }
                            break;
                    }
                }
        }
    }

    private void plusOperation() {
        result_operation = firstValues + secondValues;
        result.showText(result_operation.toString());
    }

    private void minusOperation() {
        result_operation = firstValues - secondValues;
        result.showText(result_operation.toString());
    }

    private void multiplyOperation() {
        result_operation = firstValues * secondValues;
        result.showText(result_operation.toString());
    }

    private void divideOperation() {
        result_operation = firstValues / secondValues;
        result.showText(result_operation.toString());
    }
}