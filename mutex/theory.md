Задача мьютекса — обеспечить такой механизм, чтобы доступ к объекту в определенное время был только у одного потока. Если Поток-1 захватил мьютекс объекта А, остальные потоки не получат к нему доступ, чтобы что-то в нем менять. До тех пор, пока мьютекс объекта А не освободится, остальные потоки будут вынуждены ждать.