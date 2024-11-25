package adt.stack;

public class StackImpl<T> implements Stack<T> {

	private T[] array;
	private int top;

	@SuppressWarnings("unchecked")
	public StackImpl(int size) {
		array = (T[]) new Object[size];
		top = -1;
	}

	@Override
	public T top() {
		T value = null;
		if(!isEmpty()) {
			value = this.array[top];
		}
		return value;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public boolean isFull() {
		return top == this.array.length-1;
	}

	@Override
	public void push(T element) throws StackOverflowException {
		if(isFull()) {
			throw new StackOverflowException();
		}
		if(element != null) {
			this.array[++top] = element;
		}
	}

	@Override
	public T pop() throws StackUnderflowException {
		if(isEmpty()) {
			throw new StackUnderflowException();
		}
		T element = this.array[top];
		this.top--;
		return element;
	}
}